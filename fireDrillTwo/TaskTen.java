package fireDrillTwo;

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int validCounter = 0;
        double average = 0.0;
        for(int count = 0; count < 10 ;count++ ) {
            System.out.print("Enter ten numbers between the range 1 - 100: ");
            int validScore = input.nextInt();
            if (validScore >= 0 && validScore <= 100) {
                sum += validScore;
                validCounter ++;

            }
            average = (double) sum  / validCounter;
        }

        System.out.printf("Average of valid scores  is %.2f", average);
        System.out.print(validCounter);
    }
}
