package ru.netology.Money.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class vacationmoneyservices {
    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"})

    public void calculate(int income, int expenses, int threshold, int expected) {
        Vacationmoney services = new Vacationmoney();

        int actual = services.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}

