package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcServiceTest {
    @Test
    void VacationMonthsTestIncome10_000() {
        CalcService service = new CalcService();
        int expected = 3;
        int actual = service.calcVacation(10_000, 3000, 20_000);
        assertEquals(expected, actual);


    }

    @Test
    void VacationMonthsTestIncome100_000() {
        CalcService service = new CalcService();
        int expected = 2;
        int actual = service.calcVacation(100_000, 60_000, 150_000);
        assertEquals(expected, actual);


    }


}
