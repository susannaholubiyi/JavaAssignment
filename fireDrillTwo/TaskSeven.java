package fireDrillTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int sum = 0;
        int evenScoreCounter = 0;
        double average = 0;
        for(int count = 0; count < 10 ;count++ ){
            System.out.print("Enter Score: ");
            int score = input.nextInt();
            if(score% 2 == 0) {
                sum += score;
                evenScoreCounter ++;
                average = (double) sum / evenScoreCounter;
            }

        }
        System.out.printf("Sum of even scores  is %d and Average of even scores is %.2f ", sum, average);
    }
}
