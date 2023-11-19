import java.util.Scanner;
  
  public class AgeInYearsToDays{

   public static void main(String[] args){

      Scanner input;
       input= new Scanner(System.in);
    
        System.out.print('Enter age in years: ");
         int ageInYears= input.nextInt();

          int ageInDays= (ageInYears*365);

         System.out.printf("%nD", ageInDays);



   }

}