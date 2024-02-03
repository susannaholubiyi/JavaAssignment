import java.util.Scanner;

public class PrimeNumberChecker{
    public static void main(String... args){
    
    	Scanner scanner = new Scanner(System.in);
	PrimeNumberInput primeNumberInput = new PrimeNumberInput();
	    	
    	int positiveNumber = 0;
    	
    	positiveNumber = primeNumberInput.primeNumberInputGetter();
    	
    	while(positiveNumber <= 0){
    		System.out.println("Invalid input!");
  		positiveNumber = primeNumberInput.primeNumberInputGetter();
    			
    		}
    		
    		int factorCounter = 0;
    		for(int index = 1; index <= positiveNumber; index++){
    			if(positiveNumber % index == 0){
    				factorCounter++;
    			}
    			
    		}
    		if (factorCounter == 2){
    			System.out.print("It's a prime number!");
    		}
    		
    		else{
    			System.out.print("It's not a prime number!");
    		}
    		
	
	}
    	
   }
  

