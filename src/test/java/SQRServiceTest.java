package ru.netology.sqr.sqrservice.servises;

import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void CalclateInSideLimits() {
        SQRService service = new SQRService();

        int x = 200;
        int y = 300;
        long expected = 3;
        long actual = service.calcSqrt(x, y);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalclateOutSideLimitsUnder() {
        SQRService service = new SQRService();

        int x = 1;
        int y = 9;
        long expected = 0;
        long actual = service.calcSqrt(x, y);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void CalclateOutSideLimitsUpper() {
        SQRService service = new SQRService();

        int x = 9810;
        int y = 10000;
        long expected = 0;
        long actual = service.calcSqrt(x, y);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void CalclateLimitLow() {
        SQRService service = new SQRService();

        int x = 0;
        int y = 100;
        long expected = 1;
        long actual = service.calcSqrt(x, y);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void CalclateLimitHigh() {
        SQRService service = new SQRService();

        int x = 9801;
        int y = 9900;
        long expected = 1;
        long actual = service.calcSqrt(x, y);
        assertEquals(expected, actual);
    }
}
