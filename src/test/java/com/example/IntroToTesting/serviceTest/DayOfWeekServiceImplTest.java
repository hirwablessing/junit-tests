package com.example.IntroToTesting.serviceTest;

import com.example.IntroToTesting.services.DayOfWeekServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeekServiceImplTest {
    @Test
    public void test_pass() {
        DayOfWeekServiceImpl dayofweek = new DayOfWeekServiceImpl();
        String result = dayofweek.getDay(3);
        String expected = "WEDNESDAY";
        assertEquals(result,expected);
    }
    @Test
    public void getDay_invalidTest() {
        DayOfWeekServiceImpl dayofweek = new DayOfWeekServiceImpl();
        String result = dayofweek.getDay(8);
        String expected = "Invalid";
        assertEquals(result,expected);
    }
}
