import java.util.Scanner;

 public class RaisedToPower{

  public static void main(String[] args){

   Scanner inputCollector;
    inputCollector= new Scanner(System.in);

     System.out.print("Enter first integer: ");
      int firstInteger= inputCollector.nextInt();

       System.out.print("Enter second integer: ");
        int secondInteger= inputCollector.nextInt();

         double firstIntegerRaisedToPowerSecondInteger= Math.pow(firstInteger, secondInteger);

          double secondIntegerRaisedToPowerFirstInteger= Math.pow(secondInteger,firstInteger);

           System.out.print("X raised to power Y, input one of the two integer as X: ");
            double X= inputCollector.nextDouble();
             System.out.print("Input the second integer as Y: ");
              double Y= inputCollector.nextDouble();

             if (X== firstInteger) System.out.printf("First integer raise to power second integer= %.2f",firstIntegerRaisedToPowerSecondInteger);

              if (X== secondInteger) System.out.printf("Second integer raised to power first integer= %.2f",secondIntegerRaisedToPowerFirstInteger);

        

  }
}