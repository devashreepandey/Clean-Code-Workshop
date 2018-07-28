package com.thoughtworks.movierental;

class TextStatement {
  public String display(String customerName, Rentals rentals) {
    String result = "Rental Record for " + customerName + "\n";
    for (Rental rental : rentals) {
      result += "\t" + rental.movieTitle() + "\t" +
          String.valueOf(rental.amount()) + "\n";
    }

    result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
    result += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints())
        + " frequent renter points";
    return result;
  }
}
