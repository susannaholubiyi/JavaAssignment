package fireDrillTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int count = 0; count < 10 ;count++ ){
            System.out.print("Enter Score: ");
            int score = input.nextInt();
            sum += score;

        }
        System.out.printf("Sum of scores is %d ", sum);
    }
}
