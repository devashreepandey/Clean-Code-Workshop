package com.thoughtworks.movierental;

import java.util.List;

class TextStatement {
  public String display(String name, List<Rental> rentals, double totalAmount, int totalFrequentRentalPoints) {
    String result = "Rental Record for " + name + "\n";
    for (Rental rental : rentals) {
      //show figures for this rental
      result += "\t" + rental.getMovie().getTitle() + "\t" +
          String.valueOf(rental.amount()) + "\n";
    }

    //add footer lines result
    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(totalFrequentRentalPoints)
        + " frequent renter points";
    return result;
  }
}
