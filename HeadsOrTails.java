import java.util.Scanner;

 import java.util.Random;

  public class HeadsOrTails{

   public static void main(String[] args){


     Scanner input;
      input = new Scanner(System.in);

       Random randomNumber;
        randomNumber = new Random();

         int headOrTail = randomNumber.nextInt(2);

         System.out.print ("Make a guess, '0' representing heads & '1' representing tails: ");
          int guess = input.nextInt();

           
           if (guess == headOrTail) System.out.print("Your guess is correct!!!");

            else System.out.print("Your guess is incorrect!!!");
  





   }
}