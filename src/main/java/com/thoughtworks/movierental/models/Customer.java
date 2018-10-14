package com.thoughtworks.movierental.models;

import com.thoughtworks.movierental.presentation.HtmlStatement;
import com.thoughtworks.movierental.presentation.TextStatement;

public class Customer {
  private String name;
  private String email;
  private Rentals rentals = new Rentals();

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public Rentals getRentals() {
    return rentals;
  }

  public String statement() {
    return new TextStatement().display(getName(), rentals);
  }

  public String htmlStatement() {
    return new HtmlStatement().display(getName(), rentals);

  }

}

