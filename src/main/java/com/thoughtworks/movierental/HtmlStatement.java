package com.thoughtworks.movierental;

import java.util.List;

class HtmlStatement {
  public String display(String customerName, List<Rental> rentals, double totalAmount, int totalFrequentRenterPoints) {
    String result = "<h1>Rental Record for " + customerName + "</h1><p>";
    for (Rental rental : rentals) {
      result += rental.movieTitle() + " <b>" +
              String.valueOf(rental.amount()) + "</b><br>";
    }

    result += "</p><p>Amount owed is <b>" + String.valueOf(totalAmount) + "</b></p>";
    result += "<p>You earned <b>" + String.valueOf(totalFrequentRenterPoints)
            + "</b> frequent renter points</p>";
    return result;
  }
}
