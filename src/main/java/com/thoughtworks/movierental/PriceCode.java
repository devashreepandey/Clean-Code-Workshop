package com.thoughtworks.movierental;

public interface PriceCode {
    int type();
    double amount(int daysRented);
    int frequentRenterPoints(int daysRented);

}
