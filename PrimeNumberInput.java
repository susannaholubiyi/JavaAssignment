import java.util.Scanner;
public class PrimeNumberInput{  
	
	Scanner scanner = new Scanner(System.in);
  	
	public int primeNumberInputGetter(){
	
		System.out.print("Enter any positive number to check if it is a prime: ");	
    		String collector = scanner.nextLine();
    		int positiveNumber = 0;
    		try {
    			positiveNumber = Integer.parseInt(collector);
    		
    		}
    		catch(NumberFormatException e){
    			System.out.println("Not an integer!");
    		
    		}
    		
    		return positiveNumber;
    	
    	}
    	
}
