import java.util.Scanner;

 public class Diameter{
    public static void main(String[] args){

      Scanner input= new Scanner(System.in);

       System.out.print("Input radius");
        float radius= input.nextFloat();

        

         System.out.printf("Diameter = %f%n", 2*radius);
          System.out.printf("Circumference = %f%n", 2*3.142857148*radius);
           System.out.printf("Area = %f%n ", (3.142857148*(radius*radius))); 


    }
}