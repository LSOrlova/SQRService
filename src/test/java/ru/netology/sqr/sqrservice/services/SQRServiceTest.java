package ru.netology.sqr.sqrservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrservice.csv")
    public void CalculateLimits(int x, int y, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(x, y);
        Assertions.assertEquals(expected, actual);
    }
}