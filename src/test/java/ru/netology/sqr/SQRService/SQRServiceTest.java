package ru.netology.sqr.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {
    @Test
    public void shouldSqrTestReturn() {
        SQRService service = new SQRService();
        int number = 60;
        int expected = 6;

        int actual = service.sqrRange(200, 400);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public  void  shouldSqrTestReturnNumber() {
        SQRService service = new SQRService();
        int number = 40;
        int expected = 6;

        int actual = service.sqrRange(200, 400);

        Assertions.assertEquals(expected,actual);
    }
}











