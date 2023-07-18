package main.java.org.example;

import org.example.SafeInput;
import java.util.Scanner;

public class LinearScan {
    public static void main(String[] args) {
        int[] dataPoints = generateRandomArray(100, 1, 100);

        Scanner in = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(in,"Enter a value between ", 1, 100);
        int countValue = 0;

        for (int valueNumber : dataPoints) {
            if (valueNumber == userValue) {
                countValue++;
            }
        }

        System.out.println("This value was found " + countValue + " times in the array.");

        userValue = SafeInput.getRangedInt(in,"Enter the value ", 1, 100);
        int positionValue = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                positionValue = i;
                break;
            }
        }

        if (positionValue != -1) {
            System.out.println("This value " + userValue + " was found at array index " + positionValue + ".");
        } else {
            System.out.println("This value " + userValue + " was not found in the array.");
        }

        int minNumber = dataPoints[0];
        int maxNumber = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minNumber) {
                minNumber = dataPoints[i];
            }

            if (dataPoints[i] > maxNumber) {
                maxNumber = dataPoints[i];
            }
        }

        System.out.println("Minimum value of the array: " + minNumber);
        System.out.println("Maximum value of the array: " + maxNumber);

        double averageNumber = getAverage(dataPoints);
        System.out.println("The average of dataPoints is " + averageNumber);
    }

    public static int[] generateRandomArray(int length, int minN, int maxN) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (maxN - minN + 1) + minN);
        }
        return array;
    }

    public static double getAverage(int[] values) {
        int sumN = 0;
        for (int value : values) {
            sumN += value;
        }
        return (double) sumN / values.length;
    }
}