package com.thoughtworks.movierental;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void shouldGenerateStatement() {
        Customer kuldeep = new Customer("Kuldeep");
        kuldeep.addRental(new Rental(new Movie("Dhadak", Movie.NEW_RELEASE), 2));
        kuldeep.addRental(new Rental(new Movie("Gunda", Movie.REGULAR), 2));
        kuldeep.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 2));

        assertThat(kuldeep.statement(), is("Rental Record for Kuldeep\n" +
                "\tDhadak\t6.0\n" +
                "\tGunda\t2.0\n" +
                "\tToy Story\t1.5\n" +
                "Amount owed is 9.5\n" +
                "You earned 4 frequent renter points"));

    }

    @Test
    public void shouldGenerateHtmlStatement() {
        Customer kuldeep = new Customer("Kuldeep");
        kuldeep.addRental(new Rental(new Movie("Dhadak", Movie.NEW_RELEASE), 2));
        kuldeep.addRental(new Rental(new Movie("Gunda", Movie.REGULAR), 2));
        kuldeep.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 2));

        String statement = kuldeep.htmlStatement();

        assertThat(statement, is("<h1>Rental Record for Kuldeep</h1>" +
                "<p>Dhadak <b>6.0</b><br>" +
                "Gunda <b>2.0</b><br>" +
                "Toy Story <b>1.5</b><br></p>" +
                "<p>Amount owed is <b>9.5</b></p>" +
                "<p>You earned <b>4</b> frequent renter points</p>"));

    }
}