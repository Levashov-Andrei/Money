package ru.netology.Money.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;


public class VacationmoneyServices {
    @ParameterizedTest


    void calculate(int income, int expenses, int threshold) {
        VacationmoneyServices services = new VacationmoneyServices();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = services.calculate(income, expenses, threshold);

        Assertions.assertArrayEquals(expected, actual);

    }

}

