package com.thoughtworks.movierental;

import java.util.ArrayList;

class Rentals extends ArrayList<Rental> {


  public int totalFrequentRentalPoints() {
    int totalFrequentRenterPoints = 0;
    for (Rental rental : this) {
      totalFrequentRenterPoints += rental.frequentRentalPoints();
    }
    return totalFrequentRenterPoints;
  }

  public double totalAmount() {
    double totalAmount = 0;
    for (Rental rental : this) {
      totalAmount += rental.amount();
    }
    return totalAmount;
  }
}
