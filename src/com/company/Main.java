package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[100];
        setArray1To100(nums);
        double sum = 0;
        for (int k=0; k<100; k++) {
            sum += generateAllNumbers(nums);
        }
        System.out.println("When running 100 times, it took an average of " + (sum/100) + " tries to generate every number from 1-100");
        setArray1To100(nums);
        for (int k=0; k<1000; k++) {
            sum += generateAllNumbers(nums);
        }
        System.out.println("When running 1,000 times, it took an average of " + (sum/1000) + " tries to generate every number from 1-100");
        setArray1To100(nums);
        for (int k=0; k<10000; k++); {
            sum += generateAllNumbers(nums);
        }
        System.out.println("When running 10,000 times, it took an average of " + (sum/10000) + " tries to generate every number from 1-100");
    }

    public static int generateAllNumbers(int[] numbers) {
        boolean generateNums = true;
        int i;
        for (i=0; generateNums; i++) {
            generateNums = false;
            int testNum = (int)(Math.random()*100+1);
            for (int j=0; j<numbers.length; j++) {
                if (testNum == numbers[j]) {
                    numbers[j] = -1;
                }
            }
            if (i>100) {
                for (int j=0; j<numbers.length; j++) {
                    if (numbers[j] != -1) {
                        generateNums = true;
                    }
                }
            } else {
                generateNums = true;
            }
        }
        return i;
    }

    public static void setArray1To100(int[] numbers) {
        for (int i=0; i<100; i++) {
            numbers[i] = i+1;
        }
    }
}
