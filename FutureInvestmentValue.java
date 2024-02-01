import java.util.Scanner;
   
 public class FutureInvestmentValue{
  public static void main(String[] args){

   Scanner input;
    input= new Scanner(System.in);

     System.out.print("Enter investment amount: ");
      double investmentAmount= input.nextDouble();

       System.out.print("Enter percentage annual interest: ");
        double percentageAnnualInterest= input.nextDouble();

         double annualInterest= percentageAnnualInterest/100;

          double monthlyInterest= annualInterest/12;

           double monthlyInterestPlusOne= monthlyInterest + 1;
         
            System.out.print("Enter number of years: ");
             double numberOfYears= input.nextDouble();

              double numberOfMonths= numberOfYears*12;

               double monthlyInterestPlusOneRaiseToPowerNumberOfMonths= Math.pow(monthlyInterestPlusOne,numberOfMonths);

                double futureInvestmentValue= investmentAmount*monthlyInterestPlusOneRaiseToPowerNumberOfMonths;

            System.out.printf("Future investment amount= %.2f%n", futureInvestmentValue);
        
               
        

     

           

 }
}