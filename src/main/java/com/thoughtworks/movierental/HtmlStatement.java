package com.thoughtworks.movierental;

class HtmlStatement {
  public String display(String customerName, Rentals rentals) {
    String result = "<h1>Rental Record for " + customerName + "</h1><p>";

    for (Rental rental : rentals) {
      result += rental.movieTitle() + " <b>" +
              String.valueOf(rental.amount()) + "</b><br>";
    }

    result += "</p><p>Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b></p>";
    result += "<p>You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints())
            + "</b> frequent renter points</p>";
    return result;
  }
}
