package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rentals extends ArrayList<Rental> {

    public Rentals(Collection<? extends Rental> c) {
        super(c);
    }

    int totalFrequentRenterPoints() {
      int totalFrequentRenterPoints = 0;
      for (Rental rental : this) {
        totalFrequentRenterPoints += rental.frequentRenterPoints();
      }
      return totalFrequentRenterPoints;
    }

    double totalAmount() {
      double totalAmount = 0;
      for (Rental rental : this) {
        totalAmount += rental.amount();
      }
      return totalAmount;
    }
}
