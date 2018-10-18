package com.movierental;

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
    int frequentRenterPoints = 0;
    String result = "Rental Record for " + getName() + "\n";
    for (Rental rental : rentals) {
      double amount = rental.amount();
      // add frequent renter points
      frequentRenterPoints++;
      // add bonus for a two day new release rental
      if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
          &&
          rental.getDaysRented() > 1) frequentRenterPoints++;

      //show figures for this rental
      result += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(amount) + "\n";
      totalAmount += amount;
    }

    //add footer lines result
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints)
        + " frequent renter points";
    return result;
  }

}

