package com.thoughtworks.movierental;

public interface PriceCode{
    double amount(int daysRented);
    int frequentRentalPoints(int daysRented);
    static PriceCode NEW_RELEASE(){
        return new PriceCode() {
            @Override
            public double amount(int daysRented) {
                return daysRented * 3;
            }

            @Override
            public int frequentRentalPoints(int daysRented) {
                return daysRented > 1 ? 2 : 1;
            }
        };
    }

    static PriceCode REGULAR(){
        return new PriceCode() {
            @Override
            public double amount(int daysRented) {
                double thisAmount = 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                return thisAmount;
            }

            @Override
            public int frequentRentalPoints(int daysRented) {
                return 1;
            }
        };
    }
    static PriceCode CHILDRENS(){
        return new PriceCode() {
            @Override
            public double amount(int daysRented) {
                double thisAmount = 0;
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                return thisAmount;
            }

            @Override
            public int frequentRentalPoints(int daysRented) {
                return 1;
            }
        };
    }
}




