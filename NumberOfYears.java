import java.util.Scanner;
 public class NumberOfYears{
  public static void main(String[] args){

   Scanner input; 
    input= new Scanner(System.in);
     System.out.print("Input number of minutes: ");
      int numberOfMinutes= input.nextInt();

      int numberOfDays= numberOfMinutes/1440;

       int numberOfYears= numberOfDays/365;

           int newNumberOfDays= numberOfDays%365;      
            
            int remainder= numberOfYears*365;

             int days= numberOfDays-remainder;
         

      System.out.printf("Number of years : %d years and %d days",numberOfYears,days);



}
}