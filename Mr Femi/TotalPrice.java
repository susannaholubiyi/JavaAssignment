import java.util.Scanner;

  public class TotalPrice{
  
    public static void main(String[] args){
    
    Scanner input;
    input = new Scanner(System.in);
    
    
    System.out.print("Enter an item: ");   
    String item = input.nextLine();
    
    
    System.out.print("Enter price for " + item + ": " );
    double price = input.nextDouble();
    
   
    double discount = price * 0.10;
    
      
    double grandTotal = price - discount;
    
    
    if (price > 0){
    System.out.printf("%nItem : %s ", item);
    System.out.printf("%nPrice : %.2f ", price);
    System.out.printf("%nTen percent Discount: %.2f ", discount);
    System.out.println ("\n-----------------------------");
    System.out.printf("%nGrandTotal: %.2f ", grandTotal);
    System.out.println("\n------------------------------");
  }
  
  else if (price <= 0) System.out.print("Please, enter a valid amount.");
  
  
  
  
    }
  }
