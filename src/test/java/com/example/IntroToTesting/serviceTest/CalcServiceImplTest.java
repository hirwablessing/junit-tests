package com.example.IntroToTesting.serviceTest;

import com.example.IntroToTesting.services.CalcServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcServiceImplTest {
    @Test
    public void calcSum_emptyList() {
        CalcServiceImpl calcServiceImpl = new CalcServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {});
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }
}
