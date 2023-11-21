import java.util.Scanner;

  public class WorldPopulationGrowthCalculator{

   public static void main(String[] args){

     
     Scanner inputCollector;

      inputCollector = new Scanner(System.in);

      
        System.out.print("Enter current world population: ");

         double currentWorldPopulation = inputCollector.nextDouble();


           System.out.print("Enter annual world population growth rate: ");

            double growthRate = inputCollector.nextDouble();


            double worldPopulationGrowthInOneYear = currentWorldPopulation * ((1 + growthRate) * 1);

             double worldPopulationGrowthInTwoYears = currentWorldPopulation * ((1+ growthRate) * 2);

              double worldPopulationGrowthInThreeYears = currentWorldPopulation * ((1 + growthRate) * 3);

               double worldPopulationGrowthInFourYears = currentWorldPopulation * ((1 + growthRate) * 4);

                double worldPopulationGrowthInFiveYears = currentWorldPopulation * ((1 + growthRate) * 5);


                 System.out.printf("World population growth in one year is %.2f", worldPopulationGrowthInOneYear);

                  System.out.printf("%nWorld population growth in two years is %.2f", worldPopulationGrowthInTwoYears);

                   System.out.printf("%nWorld population growth in three years is %.2f", worldPopulationGrowthInThreeYears);

                    System.out.printf("%nWorld population growth in four years is %.2f", worldPopulationGrowthInFourYears);

                     System.out.printf("%nWorld population growth in five years is %.2f", worldPopulationGrowthInFiveYears);





   }
}