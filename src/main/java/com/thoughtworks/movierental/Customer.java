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
    double totalAmount = 0;
    int totalFrequentRenterPoints = 0;
    String result = "Rental Record for " + getName() + "\n";
    for (Rental rental : rentals) {
      double thisAmount = rental.amount();
      totalFrequentRenterPoints += rental.frequentRentalPoints();

      //show figures for this rental
      result += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(thisAmount) + "\n";
      totalAmount += thisAmount;
    }

    //add footer lines result
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(totalFrequentRenterPoints)
        + " frequent renter points";
    return result;
  }

}

