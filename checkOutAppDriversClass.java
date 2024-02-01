import java.util.Scanner;


public class checkOutAppDriversClass{

    public static void main(String... args){
  	
  	Scanner input = new Scanner(System.in);
  	CheckOutApp checkOutApp = new CheckOutApp();  
 
	 	  	
  	System.out.print("What is the customer's Name?: ");
  	String customersName = input.nextLine();
  	checkOutApp.setCustomersName(customersName);
    	checkOutApp.checkOutInformation();
  	System.out.print("Add more Items? (yes/no): ");  
  	String answer = input.next(); 

	while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")){
		System.out.print("Invalid input\nAdd more Items? (yes/no): ");
		answer = input.next();
    		}

  	while (answer.equalsIgnoreCase("yes")){
    		checkOutApp.checkOutInformation();
    		
    		System.out.print("Add more Items?: ");  
  		answer = input.next(); 
  		}
    	input.nextLine();
  	System.out.print("What is your name?: ");
  	String cashiersName = input.nextLine();
  	checkOutApp.setCashiersName(cashiersName); 
  	System.out.print("How much discount will he get?: "); 
  	double discount = input.nextDouble();
  	checkOutApp.setDiscount(discount); 
	System.out.println(); 
	System.out.print("SEMICOLON STORES"); 
	System.out.print("\nMAIN BRANCH");
	System.out.print("\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS."); 
	System.out.print("\nTEL: 03293828343");
	System.out.print("\nDate: " + checkOutApp.getDateAndTime());
	System.out.print("\nCashier: " + checkOutApp.getCashiersName() ); 
	System.out.print("\nCustomer Name: " + checkOutApp.getCustomersName() );
	System.out.println();    
    	checkOutApp.displayOutput();
    	
    	System.out.print("\n\n\nHow much did the customer give to you?: ");
  	double amountPaid = input.nextDouble();    
  	while (amountPaid < checkOutApp.billTotalMethod()) {
  		System.out.print("Please sir, don't allow us go bankrupt\nHow much did the customer give to you?: ");
  		amountPaid = input.nextDouble();      		
  	}	
  	
  	checkOutApp.setAmountPaid(amountPaid);
  	checkOutApp.finalOutput();
  
    
    	
    }
    
    
}
