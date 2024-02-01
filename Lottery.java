import java.util.Scanner;

import java.util.Random;

 public class Lottery{

   public static void main(String[] args){

    Scanner inputCollector;
     inputCollector = new Scanner(System.in);

     Random randomNumber;
      randomNumber = new Random();

      int lotteryNumber = randomNumber.nextInt(900)+100;


        System.out.print("Guess a three digit number to win a lottery: ");
        int guessNumber = inputCollector.nextInt();

        

           int firstDigitOfGuessNumber = guessNumber / 100;

            int integerWithTwoZeros = firstDigitOfGuessNumber * 100;

             int twoDigitGuessNumber = guessNumber - integerWithTwoZeros;

              
              int secondDigitOfGuessNumber = twoDigitGuessNumber / 10;

               int integerWithOneZero = secondDigitOfGuessNumber *10;

               
                 int thirdDigitOfGuessNumber = twoDigitGuessNumber - integerWithOneZero;




                  int firstDigitOfLotteryNumber = lotteryNumber / 100;

                   int lotteryNumberTimes100 = firstDigitOfLotteryNumber * 100;

                    int twoDigitLotteryNumber = lotteryNumber - lotteryNumberTimes100;


                     int secondDigitOfLotteryNumber = twoDigitLotteryNumber / 10;

                      int lotteryNumberTimes10 = secondDigitOfLotteryNumber * 10;


                       int thirdDigitOfLotteryNumber = twoDigitLotteryNumber - lotteryNumberTimes10;




                  if (lotteryNumber == guessNumber) System.out.print ("You won $10,000!");


                   
                
                   else if ((firstDigitOfGuessNumber == secondDigitOfLotteryNumber) && ( secondDigitOfGuessNumber == thirdDigitOfLotteryNumber) 
                     && (thirdDigitOfGuessNumber == firstDigitOfLotteryNumber)) System.out.print ("You won $3,000!");


                    else if ((firstDigitOfGuessNumber == thirdDigitOfLotteryNumber) && (secondDigitOfGuessNumber == firstDigitOfLotteryNumber) 
                      && ( thirdDigitOfGuessNumber == secondDigitOfLotteryNumber)) System.out.print ("You won $3,000!");


                     else if (( firstDigitOfGuessNumber == secondDigitOfLotteryNumber)  && (secondDigitOfGuessNumber == firstDigitOfLotteryNumber) 
                      && ( thirdDigitOfGuessNumber == thirdDigitOfLotteryNumber)) System.out.print ("You won $3,000!");


                       else if (( firstDigitOfGuessNumber == firstDigitOfLotteryNumber) && ( secondDigitOfGuessNumber == thirdDigitOfLotteryNumber) 
                        && (thirdDigitOfGuessNumber == secondDigitOfLotteryNumber)) System.out.print ("You won $3,000!");


                        else if (( firstDigitOfGuessNumber == thirdDigitOfLotteryNumber) && (secondDigitOfGuessNumber == secondDigitOfLotteryNumber)
                         && (thirdDigitOfGuessNumber == firstDigitOfLotteryNumber)) System.out.print ("You won $3,000!");


                        
                        
                      else if ((firstDigitOfGuessNumber == firstDigitOfLotteryNumber) || (firstDigitOfGuessNumber== secondDigitOfLotteryNumber) ||
                            (firstDigitOfGuessNumber == thirdDigitOfLotteryNumber)) System.out.print("You won $1,000!");
                          
                         else if ((secondDigitOfGuessNumber == firstDigitOfLotteryNumber) || (secondDigitOfGuessNumber == secondDigitOfLotteryNumber) ||
                            (secondDigitOfGuessNumber ==  thirdDigitOfLotteryNumber)) System.out.print("You won $1,000!");

                           else if ((thirdDigitOfGuessNumber == firstDigitOfLotteryNumber) || (thirdDigitOfGuessNumber == secondDigitOfLotteryNumber) || 
                            (thirdDigitOfGuessNumber == thirdDigitOfLotteryNumber))   System.out.print (" You won $1,000!");



                     else System.out.print("Try again, you're so close!");


                        

                  

                






  }
}