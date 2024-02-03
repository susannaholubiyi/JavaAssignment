package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int count = 0; count < 10 ;count++ ){
            System.out.print("Enter Score: ");
            int score = input.nextInt();
            if(score% 2 == 0) {
                sum += score;
            }

        }
        System.out.printf("Sum of even scores  is %d ", sum);
    }
}
