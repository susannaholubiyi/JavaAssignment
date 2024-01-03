import java.util.Scanner;

  public class TotalPrice{
  
    public static void main(String[] args){
    
    Scanner input;
    input = new Scanner(System.in);
    
    
    System.out.print("Enter an item: ");   
    String item = input.nextLine();
    
    
    System.out.println("Enter price for" + item + ": " );
    double price = input.nextDouble();
    
    double discount = price * 0.10;
    
    
    
    
      
    double grandTotal = price - discount;
    
    
    System.out.printf("%nItem : %s ", item);
    System.out.printf("%nPrice : %.2f ", price);
    System.out.printf("%nDiscount: %.2f ", discount);
    System.out.println ("-----------------------------");
    System.out.printf("%nGrandTotal: %.2f ", grandTotal);
    System.out.println("------------------------------");
  
  
  
  
  
    }
  }
