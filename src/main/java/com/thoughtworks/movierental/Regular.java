package com.thoughtworks.movierental;

public class Regular implements PriceCode{

    private static final int BASE_PRICE = 2;

    @Override
    public int type() {
        return Movie.REGULAR;
    }

    @Override
    public double amount(int daysRented) {
        double amount = BASE_PRICE;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }

    @Override
    public int frequentRenterPoints(int daysRented) {
        return 1;
    }
}
