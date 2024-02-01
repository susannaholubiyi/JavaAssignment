import java.util.Scanner;
 public class Length{

  public static void main(String[] args){

    Scanner inputCollector;
      inputCollector= new Scanner(System.in);

        System.out.print("Input speed: ");
         double speed= inputCollector.nextDouble();

          System.out.print("Input acceleration: ");
           double acceleration = inputCollector.nextDouble();

             double speedSquare= speed * speed;
             
              double accelerationTimesTwo= 2 *acceleration;

               double length= speedSquare / accelerationTimesTwo;


       System.out.printf("Length= %n%.2f meters", length);  




  }
}