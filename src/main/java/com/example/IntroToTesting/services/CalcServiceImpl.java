package com.example.IntroToTesting.services;

public class CalcServiceImpl {
    public int calcSum(int[] data){
        int sum = 0;
        for(int value: data){
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
