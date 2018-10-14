package com.thoughtworks.movierental.services;

import com.sun.mail.smtp.SMTPTransport;
import com.thoughtworks.movierental.models.Customer;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class ReminderService {

  private final CustomerService customerService;

  public ReminderService(CustomerService customerService){
    this.customerService = customerService;
  }

  public void sendReminders() throws IOException, MessagingException {
    List<Customer> allCustomers = customerService.getAll();
    for (Customer customer : allCustomers) {
      InputStream stream = this.getClass().getClassLoader().getResourceAsStream("movierental.properties");
      Properties properties = new Properties();
      properties.load(stream);
      stream.close();
      Session session = Session.getInstance(properties);
      Message msg = new MimeMessage(session);
      msg.setFrom(new InternetAddress("no-reply@movierental.com"));
      msg.setRecipients(Message.RecipientType.TO,
          InternetAddress.parse(customer.getEmail(), false));
      msg.setSubject("Reminder - Amount Due");
      msg.setText(customer.statement());
      msg.setSentDate(new Date());
      SMTPTransport t =
          (SMTPTransport) session.getTransport("smtp");
      t.connect();
      t.sendMessage(msg, msg.getAllRecipients());
      t.close();
    }

  }

}
