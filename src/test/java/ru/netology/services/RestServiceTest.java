package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestServiceTest {

    @Test
    public void testRest1() {
        // Arrange
        RestService service = new RestService();
        // Act
        int actual = service.calculate( 10_000, 3_000, 20_000);
        // Assert
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRest2() {
        // Arrange
        RestService service = new RestService();
        // Act
        int actual = service.calculate( 100_000, 60_000, 150_000);
        // Assert
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}