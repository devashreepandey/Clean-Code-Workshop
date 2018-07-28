package com.thoughtworks.movierental;

public class Movie {
  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String title;
  private PriceCode priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = createPriceCode(priceCode);
  }

  public int getPriceCode() {
    return priceCode.type();
  }

  public void setPriceCode(int arg) {
    priceCode = createPriceCode(arg);
  }

  public String getTitle() {
    return title;
  }

  double amount(int daysRented) {
      return priceCode.amount(daysRented);
    }


  int frequentRenterPoints(int daysRented) {
    return priceCode.frequentRenterPoints(daysRented);
  }

  private PriceCode createPriceCode(int code){
    switch (code) {
      case REGULAR:
        return new Regular();
      case NEW_RELEASE:
        return new NewRelease();
      case CHILDRENS:
        return new Childrens();
    }
    throw new IllegalArgumentException("Unknown PriceCode "+ String.valueOf(code));
  }

}