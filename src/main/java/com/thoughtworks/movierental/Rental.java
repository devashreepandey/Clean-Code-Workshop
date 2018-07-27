package com.thoughtworks.movierental;

public class Rental {

  private int daysRented;
  private Movie movie;

  public Rental(Movie movie, int daysRented){
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

    double amount() {
      double thisAmount = 0;
      switch (movie.getPriceCode()) {
        case Movie.REGULAR:
          thisAmount += 2;
          if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
          break;
        case Movie.NEW_RELEASE:
          thisAmount += daysRented * 3;
          break;
        case Movie.CHILDRENS:
          thisAmount += 1.5;
          if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
          break;
      }
      return thisAmount;
    }

  int frequentRentalPoints() {
    return isElibileForBonus()? 2 : 1;
  }

  private boolean isElibileForBonus() {
    return movie.isNewRelease() && daysRented > 1;
  }

}