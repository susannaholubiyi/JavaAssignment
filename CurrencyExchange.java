import java.util.Scanner;

  public class CurrencyExchange{
   public static void main(String[] args){

    Scanner inputCollector;
     inputCollector= new Scanner(System.in);

      System.out.print("Enter the exchange rate from Dollars to RMD: ");
       double exchangeRate= inputCollector.nextDouble();

        System.out.print("Enter 0 to convert Dollars to RMD and 1 to convert RMD to Dollar: ");
         int conversionNumber= inputCollector.nextInt();

         if (conversionNumber==0){
          System.out.print("Enter the dollar amount: ");
           double dollarAmount= inputCollector.nextDouble();
            
             System.out.printf("$%.2f is %.2f yuan", dollarAmount, exchangeRate*dollarAmount);
}

            if (conversionNumber==1){
             System.out.print("Enter the RMD amount: ");
              double rmdAmount= inputCollector.nextDouble();
              
               System.out.printf("%n%.2f yuan is $%.2f", rmdAmount, rmdAmount/exchangeRate);
}

              
                 



  }


}