import java.util.Scanner;
 
 public class PyramidOfGiza{
  
  public static void main(String[] args){

  
   Scanner input;

    input = new Scanner(System.in);


     System.out.print("Enter number of stones used to build the great pyramid of Giza: ");

      int numberOfStones = input.nextInt();


       System.out.print("Enter average weight of each stone: ");

        int averageWeightOfStones = input.nextInt();

        
         System.out.print("Enter number of years used to build: ");

          int numberOfYears = input.nextInt();


           int totalWeightOfStones = numberOfStones * averageWeightOfStones;

          
            int howMuchWasBuiltInOneYear = totalWeightOfStones / numberOfYears;

             int howMuchWasBuiltInOneDay =  howMuchWasBuiltInOneYear / 365;

              int howMuchWasBuiltInOneHour = howMuchWasBuiltInOneDay / 24;

               int howMuchWasBuiltInOneMinute = howMuchWasBuiltInOneHour / 60;


                System.out.printf ("Amount built in a year is %d", howMuchWasBuiltInOneYear);

                System.out.printf ("%nAmount built in a day is %d", howMuchWasBuiltInOneDay);

                System.out.printf ("%nAmount built in an hour is %d", howMuchWasBuiltInOneHour);

                System.out.printf ("%nAmount built in a minute is %d", howMuchWasBuiltInOneMinute);




                


            
          







  }
}
