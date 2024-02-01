import java.util.Scanner;
 public class PetrolPurchaseTest{
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);

    PetrolPurchase petrolPurchase = new PetrolPurchase("Lagos", "Diesel", 50, 100000.00, 0.20);

     System.out.print("Enter the location which you want to buy petrol from: ");
      String location = input.nextLine();
       petrolPurchase.setLocation(location);

        System.out.print("Enter the type you want: ");
         String type = input.nextLine();
          petrolPurchase.setType(type);

           System.out.print("Enter the quantity you want in litres: ");
            int quantity = input.nextInt();
             petrolPurchase.setQuantity(quantity);

              System.out.print("Enter the price in naira: ");
               double price = input.nextDouble();
                petrolPurchase.setPrice(price);

                 System.out.print("Enter your discount in percentage: ");
                  double percentageDiscount = input.nextDouble();
                   petrolPurchase.setPercentageDiscount(percentageDiscount);

                    System.out.printf("Your purchase amount is: %.2f", petrolPurchase.getPurchaseAmount());
       


                    





   }
}