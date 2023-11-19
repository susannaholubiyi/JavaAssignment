import java.util.Scanner;

 public class SeparationOfDigit{

  public static void main(String[] args){

   Scanner inputCollector;
   
    inputCollector = new Scanner(System.in);

     System.out.print("Enter a number with five digits: ");

      int fiveDigitNumber = inputCollector.nextInt();



      
      int firstDigit = fiveDigitNumber / 10000;

       int integerWithFourZeros = firstDigit * 10000;

        int fourDigitNumber = fiveDigitNumber - integerWithFourZeros;


         int secondDigit = fourDigitNumber / 1000;

          int integerWithThreeZeros = secondDigit * 1000;

           int threeDigitNumber = fourDigitNumber - integerWithThreeZeros;

        
            int thirdDigit = threeDigitNumber / 100;

             int integerWithTwoZeros = thirdDigit * 100;

              int twoDigitNumber = threeDigitNumber - integerWithTwoZeros;


               int fourthDigit = twoDigitNumber / 10;

                int integerWithOneZeros = fourthDigit * 10;



                 int fifthDigit = twoDigitNumber - integerWithOneZeros;

 

              
                  System.out.printf("%d %d %d %d %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);











     






   }
}