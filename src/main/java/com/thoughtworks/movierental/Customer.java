package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private List<Rental> rentals = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    return new TextStatement().display(getName(), rentals, totalAmount(), totalFrequentRentalPoints());
  }

  private int totalFrequentRentalPoints() {
    int totalFrequentRenterPoints = 0;
    for (Rental rental : rentals) {
      totalFrequentRenterPoints += rental.frequentRentalPoints();
    }
    return totalFrequentRenterPoints;
  }

  private double totalAmount() {
    double totalAmount = 0;
    for (Rental rental : rentals) {
      totalAmount += rental.amount();
    }
    return totalAmount;
  }

  public String htmlStatement() {
    return new HtmlStatement().display(getName(), totalFrequentRentalPoints(), totalAmount(), rentals);

  }

}

