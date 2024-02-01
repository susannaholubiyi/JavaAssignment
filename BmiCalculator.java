import java.util.Scanner;

  public class BmiCalculator{
   public static void main(String[] args){

    Scanner input= new Scanner(System.in);

     System.out.print("Enter weight in pounds: ");
      double weight= input.nextDouble();

       System.out.print("Enter height in inches: ");
        double height= input.nextDouble();

         double weightInKilogram= weight*0.45359237;

          double heightInMeters= height*0.0254;

           double bmi= weightInKilogram / (heightInMeters * heightInMeters);

       System.out.printf("Body Mass Index (BMI) = %.2f", bmi);


  }
}