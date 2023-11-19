import java.util.Scanner;
 public class IntegerSquare{
  public static void main(String[]args){

   Scanner inputFromKeyboard;
    inputFromKeyboard= new Scanner(System.in);

     System.out.print("Input first integer (X): ");
      int X= inputFromKeyboard.nextInt();

       System.out.print("Input second integer (Y): ");
        int Y= inputFromKeyboard.nextInt();

         int squareOfX= X*X;
          int squareOfY= Y*Y;

           int sumOfSquares= squareOfX + squareOfY;

            int differenceOfSquares= squareOfX - squareOfY;

      System.out.printf("Square of first integer(X): %d. ",squareOfX);
       System.out.printf("\nSquare of second integer(Y): %d. ",squareOfY);
        System.out.printf("\nSum of their squares: %d. ",sumOfSquares); 
         System.out.printf("\nDifference of squares: %d. ",differenceOfSquares);
     

}
}