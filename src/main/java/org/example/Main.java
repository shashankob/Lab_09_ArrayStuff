package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rnd = new Random();

        int[] dataPoints = new int[100];

        for (int numberS = 0; numberS < dataPoints.length; numberS++) {
            dataPoints[numberS] = rnd.nextInt(100)+1;
        }

        for (int numberS = 0; numberS < dataPoints.length; numberS++) {
            System.out.print(dataPoints[numberS]);
            if (numberS != dataPoints.length) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sumArray = 0;
        for (int numberS = 0; numberS < dataPoints.length; numberS++) {
            sumArray += dataPoints[numberS];
        }
        double averageArray = (double) sumArray / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sumArray);
        System.out.println("The average of the random array dataPoints is: " + averageArray);


    }
}