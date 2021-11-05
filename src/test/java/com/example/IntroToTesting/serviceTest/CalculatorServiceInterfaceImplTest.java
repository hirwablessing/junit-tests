package com.example.IntroToTesting.serviceTest;

import com.example.IntroToTesting.services.CalculatorServiceInterface;
import com.example.IntroToTesting.services.CalculatorServiceInterfaceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceManyElements implements CalculatorServiceInterface {

    @Override
    public int[] getAll() {
        return new int[] {1,2,4};
    }

}

public class CalculatorServiceInterfaceImplTest {

    @Test
    public void calcSum_manyElement() {
        CalculatorServiceInterfaceImpl calcServiceImpl = new CalculatorServiceInterfaceImpl();

        calcServiceImpl.setCalcService(new CalculatorServiceManyElements());

        int actualResult = calcServiceImpl.calcSum();
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

/*
@Test
public void calcSum_emptyList() {
   ClassBCalculatorServiceImpl calcServiceImpl = new ClassBCalculatorServiceImpl();

   int actualResult = calcServiceImpl.calcSum(new int[] {});
   int expectedResult = 0;
   assertEquals(expectedResult, actualResult);
}


 @Test
public void calcSum_oneElement() {
   ClassBCalculatorServiceImpl calcServiceImpl = new ClassBCalculatorServiceImpl();

   int actualResult = calcServiceImpl.calcSum(new int[] {4});
   int expectedResult = 4;
   assertEquals(expectedResult, actualResult);
}*/

}
