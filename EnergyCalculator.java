import java .util.Scanner;

  public class EnergyCalculator{
   public static void main(String[] args){
    
    Scanner inputCollector;
     inputCollector= new Scanner(System.in);

      System.out.print("Enter amount of water in kg: ");
       double amountOfWater= inputCollector.nextDouble();

        System.out.print("Enter initial temperature in degree celcius: ");
         double initialTemperature= inputCollector.nextDouble();

          System.out.print("Enter final temperature in degree celcius: ");
           double finalTemperature= inputCollector.nextDouble();

            double energy= amountOfWater*(finalTemperature-initialTemperature)*4184;

             System.out.printf("Energy= %n%.2f", energy);








   }

}