package com.thoughtworks.movierental;

import java.util.List;

class HtmlStatement {
  public String display(String name, int totalFrequentRenterPoints, double totalAmount, List<Rental> rentals) {
    String result = "<h1>Rental Statement for <b>"+ name +"</b></h1><br/>";
    for (Rental rental : rentals) {
      //show figures for this rental
      result += rental.getMovie().getTitle() + " " +
              String.valueOf(rental.amount()) + "<br/>";
    }

    //add footer lines result
    result += "Amount owed is <b>" + String.valueOf(totalAmount) + "</b><br/>";
    result += "You earned <b>" + String.valueOf(totalFrequentRenterPoints)
            + "</b> frequent renter points";
    return result;
  }
}
