package com.thoughtworks.movierental;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.ServerSetup;
import com.thoughtworks.movierental.models.Customer;
import com.thoughtworks.movierental.models.Movie;
import com.thoughtworks.movierental.models.Rental;
import com.thoughtworks.movierental.services.CustomerService;
import com.thoughtworks.movierental.services.ReminderService;
import org.junit.Test;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class EmailTest {
  @Test
  public void testem() throws IOException, MessagingException, InterruptedException {
    // POC - The following code sends emails to a mock server

    /*ServerSetup setup = new ServerSetup(1111,"localhost","smtp");
    GreenMail greenMail = new GreenMail(setup);
    greenMail.start();
    assertTrue(greenMail.waitForIncomingEmail(5000, 1));*/

  }
}
