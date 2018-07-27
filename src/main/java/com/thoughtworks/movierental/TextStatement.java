package com.thoughtworks.movierental;

import java.util.List;

class TextStatement {
  public String display(String customerName, List<Rental> rentals, double totalAmount, int totalFrequentRenterPoints) {
    String result = "Rental Record for " + customerName + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.movieTitle() + "\t" +
          String.valueOf(rental.amount()) + "\n";
    }

    result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(totalFrequentRenterPoints)
        + " frequent renter points";
    return result;
  }
}
