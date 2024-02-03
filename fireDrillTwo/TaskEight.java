package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int count = 0; count < 10 ;count++ ) {
            System.out.print("Enter ten numbers between the range 1 - 100: ");
            int validScore = input.nextInt();
            while (validScore < 0 || validScore > 100) {
                System.out.print("Invalid score!");
                System.out.print("Kindly enter ten numbers between the range 1 - 100: ");
                validScore = input.nextInt();
            }
            sum += validScore;
        }

        System.out.printf("Sum of valid scores  is %d", sum);
    }
}
