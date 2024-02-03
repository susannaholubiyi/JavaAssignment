package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double average = 0;
        double sum = 0;
        for(int count = 0; count < 10 ;count++ ){
            System.out.print("Enter Score: ");
            double score = input.nextDouble();
            sum+= score;
            average =  sum / 10;

        }
        System.out.printf("Sum of scores is %.2f and average of scores is %.2f ", sum, average);

    }
}
