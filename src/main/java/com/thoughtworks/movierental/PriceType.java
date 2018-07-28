package com.thoughtworks.movierental;

import java.util.HashMap;
import java.util.Map;

public interface PriceType {
    double amount(int daysRented);
    int frequentRentalPoints(int daysRented);

    static PriceType create(int priceCode){
        return priceCodeToMovieType.get(priceCode);
    }

    final static Map<Integer, PriceType> priceCodeToMovieType = new HashMap<Integer, PriceType>(){{
        put(Movie.NEW_RELEASE, new NewRelease());
        put(Movie.REGULAR, new Regular());
        put(Movie.CHILDRENS, new Childrens());
    }};


    class NewRelease implements PriceType {
        @Override public double amount(int daysRented) { return daysRented * 3; }
        @Override public int frequentRentalPoints(int daysRented) { return daysRented > 1 ? 2 : 1; }
    }

    class Childrens implements PriceType {
        @Override public double amount(int daysRented) { return 1.5 + ((daysRented > 3)? (daysRented - 3) * 1.5 : 0); }
        @Override public int frequentRentalPoints(int daysRented) { return 1; }
    }

    class Regular implements PriceType {
        @Override public double amount(int daysRented) { return 2 + ((daysRented > 2)? (daysRented - 2) * 1.5 : 0); }
        @Override public int frequentRentalPoints(int daysRented) { return 1; }
    }
}




