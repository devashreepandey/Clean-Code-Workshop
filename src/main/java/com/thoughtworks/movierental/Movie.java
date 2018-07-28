package com.thoughtworks.movierental;

public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String title;
  private int priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public int getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(int arg) {
    priceCode = arg;
  }

  public String getTitle() {
    return title;
  }

  double amount(int daysRented) {
    return createPriceCode().amount(daysRented);
    }

  private PriceCode createPriceCode() {
    PriceCode priceCode = null;
    switch (getPriceCode()) {
      case REGULAR:
        priceCode = PriceCode.REGULAR();
        break;
      case NEW_RELEASE:
        priceCode = PriceCode.NEW_RELEASE();
        break;
      case CHILDRENS:
        priceCode = PriceCode.CHILDRENS();
        break;
    }
    return priceCode;
  }

  int frequentRentalPoints(int daysRented) {
    return createPriceCode().frequentRentalPoints(daysRented);
  }
}

