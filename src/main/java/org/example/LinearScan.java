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

        System.out.println("Minimum value: " + minNumber);
        System.out.println("Maximum value: " + maxNumber);

        double averageNumber = getAverage(dataPoints);
        System.out.println("The average of dataPoints is " + averageNumber);
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}