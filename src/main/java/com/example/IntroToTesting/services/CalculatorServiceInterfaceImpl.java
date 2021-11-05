package com.example.IntroToTesting.services;

public class CalculatorServiceInterfaceImpl {
    CalculatorServiceInterface calcService;

    public void setCalcService(CalculatorServiceInterface calcService) {
        this.calcService = calcService;
    }

    public int calcSum(){
        int sum = 0;
        for(int value: calcService.getAll()){
            sum += value;
        }
        return sum;
    }
}
