import java.util.Scanner;

 public class BmiCalculator2{

  public static void main(String[] args){

   
   Scanner input;
    input = new Scanner(System.in);

     System.out.print("Enter your weight in kilogram: ");
      double weightInKilogram = input.nextDouble();

       System.out.print("Enter your height in inches: ");
        double heightInMeters = input.nextDouble();

         double bmi = (weightInKilogram / (heightInMeters * heightInMeters));


     
          System.out.printf("BMI = %.2f", bmi);


      if (bmi <= 18.4) System.out.print("Underweight");
   
       if ((bmi >=18.5) && (bmi<= 24.9)) System.out.print("Normal");

        if ((bmi >= 25.0) && (bmi <= 39.9)) System.out.print("Overweight");

         if (bmi >= 40.0) System.out.print("Obese");






  }
}