package com.thoughtworks.movierental;

public class NewRelease implements PriceCode {
    @Override
    public int type() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double amount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
