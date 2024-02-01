import java.util.Scanner;

public class Acceleration{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
   System.out.print("Input finalVelocity in m/s: ");
    double finalVelocity = input.nextDouble();
    
     System.out.print("Input initialVelocity in m/s: ");
      double initialVelocity= input.nextDouble();

       System.out.print("Input time in seconds: ");
        double time= input.nextDouble();
      
      double acceleration=(finalVelocity- initialVelocity)/time;
      
      
System.out.printf("Acceleration is %n%.2f",acceleration);










}
}