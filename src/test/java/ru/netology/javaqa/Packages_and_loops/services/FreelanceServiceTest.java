package ru.netology.javaqa.Packages_and_loops.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelanceServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Vaftion.csv")
        //@ParameterizedTest
        //@CsvSource({
        //       "10000, 3000, 20000, 3", // Пример из условия
        //       "100000, 60000, 150000, 2" // Пример из условия
        //})
    void testCalculateVacationMonths(int income, int expenses, int threshold, int expected) {
        FreelanceService service = new FreelanceService();
        int actual = service.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


}
