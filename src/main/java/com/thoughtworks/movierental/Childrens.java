package com.thoughtworks.movierental;

public class Childrens implements PriceCode {

    private static final double BASE_PRICE = 1.5;

    @Override
    public int type() {
        return Movie.CHILDRENS;
    }

    @Override
    public double amount(int daysRented) {
        double amount = BASE_PRICE;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return 1;
    }
}
