package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrServiceTest {

    @Test
    void calculateTheSquareOfNumbersInTheGeneralRange() {
        SqrService service = new SqrService();
        int lowerBound = 400;
        int finalBoundary = 1000;
        int expected =12;
        int actual = service.calculateTheSquareOfNumbers(lowerBound, finalBoundary);

      assertEquals(expected,actual);
    }
   @Test
    void calculateTheSquareOfNumbersInTheInitialRange() {
        SqrService service = new SqrService();
        int lowerBound = 400;
        int finalBoundary = 600;
        int expected =5;
        int actual = service.calculateTheSquareOfNumbers(lowerBound, finalBoundary);

        assertEquals(expected,actual);
    }
    @Test
    void calculateTheSquareOfNumbersInTheFinalRange() {
        SqrService service = new SqrService();
        int lowerBound = 600;
        int finalBoundary = 1000;
        int expected =7;
        int actual = service.calculateTheSquareOfNumbers(lowerBound, finalBoundary);

        assertEquals(expected,actual);
    }
}