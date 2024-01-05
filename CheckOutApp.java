import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CheckOutApp{

    private static Scanner input = new Scanner(System.in);
    private String customersName;
    private String cashiersName;
    private double discount;
    private double amountPaid;
    private double subTotal;
   
   
   private ArrayList<String> itemBought = new ArrayList<String> ();
   private ArrayList<Integer> itemQuantity = new ArrayList<Integer> () ;
   private ArrayList<Double> itemPrice = new ArrayList<Double> (); 
   
   
   public String getDateAndTime() {
   
   	LocalDateTime currentTime = LocalDateTime.now();
   	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
   	
   	String currentDateTime = currentTime.format(formatter);
   	
   	return currentDateTime;
   }
   
   
   public void checkOutInformation(){
   
   	System.out.print("What did the user buy?: ");
   		String item = input.next();
   		
   		itemBought.add(item);
   		

   	System.out.print("How many pieces?: ");
   		int numberOfPieces = input.nextInt();
   		while(numberOfPieces <= 0){
   		
   			System.out.print("You've not entered the number of pieces the user got");
   			System.out.println("How many pieces?: ");
   			numberOfPieces = input.nextInt();
   			
   		}
   		itemQuantity.add(numberOfPieces);

   	
   	System.out.print("How much per unit?: ");
   		double pricePerUnit = input.nextDouble();
   		while (pricePerUnit <= 0){
   		
   			System.out.println("Price is invalid, please enter a valid price! ");
   			System.out.print("How much per unit?: ");
   			pricePerUnit = input.nextDouble();
   			
   		}
   		itemPrice.add(pricePerUnit);
   		
   	double subTotal = 0.0;
   	int counter =0;
    		for(counter =0; counter < itemBought.size(); counter++){
    		subTotal += (itemQuantity.get(counter) * itemPrice.get(counter));
    		}
    	setSubTotal(subTotal);

   } 
   
   public void setSubTotal(double subTotal){
    	this.subTotal = subTotal;
   }
   
    public double getSubTotal(){
    	return subTotal;
   }

    public void setCustomersName(String customersName){
    	this.customersName =  customersName;
    }
    
    public String getCustomersName(){
    	return customersName;
    }
    
    public void setCashiersName(String cashiersName){
    	this.cashiersName = cashiersName;
    }
    
    public String getCashiersName(){
    	return cashiersName;
    }
       
    public void setDiscount(double discount){
    	if (discount <= 0 ){
		discount = 0.0;
	}else this.discount = discount;
    }
    
    public double getDiscount(){
    	return (discount / 100) * getSubTotal();
    }
    
    public double valueAddedTaxMethod(){
    	double valueAddedTax = ( getSubTotal() * 0.075);
    	return valueAddedTax;
    }
    
    public double billTotalMethod(){
    	double billTotal = ( (getSubTotal() - getDiscount() ) + valueAddedTaxMethod() );
    
    return billTotal;
    }
    
    public void setAmountPaid(double amountPaid){
    	this.amountPaid = amountPaid;
    	
    }
    
    public double getAmountPaid(){
    	return amountPaid;
    
    }
    public void displayOutput(){
    
    	System.out.println("=====================================================");
    	System.out.println("\t\tITEM\tQTY\tPRICE\t  TOTAL(NGN)");
    	System.out.println("-----------------------------------------------------");
    	
    	for (int count = 0; count < itemBought.size(); count++) {
    		System.out.printf("\t\t%s\t%3d\t%5.2f\t  %6.2f", itemBought.get(count), 
    		itemQuantity.get(count), itemPrice.get(count), (itemQuantity.get(count) * itemPrice.get(count)));
    		System.out.println();
    		}
    	
    	System.out.println("\n-----------------------------------------------------");
    
    	System.out.printf("\t\t\tSub Total:\t  %6.2f", getSubTotal());
    	System.out.printf("\n\t\t\tDiscount:\t  %6.2f", getDiscount() );
    	System.out.printf("\n\t\t\tVAT @ 7.5%s:\t  %6.2f%n", "%", valueAddedTaxMethod() );
	System.out.println("=====================================================");
    	System.out.printf("\t\t\tBill Total:\t  %6.2f%n", billTotalMethod() );
	System.out.println("=====================================================");
	System.out.printf("\nTHIS IS NOT A RECEIPT KINDLY PAY %.2f", billTotalMethod() );
	System.out.println("\n=====================================================");
		
    }
    
        public void finalOutput(){
    
    	System.out.println("=====================================================");
    	System.out.println("\t\tITEM\tQTY\tPRICE\t  TOTAL(NGN)");
    	System.out.println("-----------------------------------------------------");
    	
    	for (int count = 0; count < itemBought.size(); count++) {
    		System.out.printf("\t\t%s\t%3d\t%5.2f\t  %6.2f", itemBought.get(count), 
    		itemQuantity.get(count), itemPrice.get(count), (itemQuantity.get(count) * itemPrice.get(count)));
    		System.out.println();
    		}
    	
    	System.out.println("\n-----------------------------------------------------");
    
    	System.out.printf("\t\t\tSub Total:\t  %6.2f", getSubTotal());
    	System.out.printf("\n\t\t\tDiscount:\t  %6.2f", getDiscount() );
    	System.out.printf("\n\t\t\tVAT @ 7.5%s:\t  %6.2f%n", "%", valueAddedTaxMethod() );
	System.out.println("=====================================================");
    	System.out.printf("\t\t\tBill Total:\t  %6.2f%n", billTotalMethod() );
    	System.out.printf("\t\t\tAmount Paid:\t  %6.2f%n", getAmountPaid() );
    	System.out.printf("\t\t\tBalance:\t  %6.2f%n", (getAmountPaid() - billTotalMethod()) );
	System.out.println("=====================================================");
	System.out.println("\nTHANK YOU FOR YOUR PATRONAGE");
	System.out.println("=====================================================");
		
    }
    	
    	 
 
}
