import java.util.Scanner;
public class Factorial{

    public static void main(String... args){
    
    	Scanner input = new Scanner(System.in);
    
    	System.out.print("Enter any positive number between 1 & 20 to get it's factorial: ");
    	int positiveNumber = input.nextInt();
    	
    	int count=0;
    	while(positiveNumber % 2 != 0 || positiveNumber <= 0) {
    		System.out.println("Invalid input!");
    		System.out.print("Enter any positive number between 1 & 20: "); 
    		positiveNumber = input.nextInt();  
    }
    	
    	int factorial = 1;
    	for(int index = 1; index <= positiveNumber; index++){
    		
    		factorial *= index;
    		

    	}
    
    System.out.printf("The factorial of %d is %d%n", positiveNumber, factorial);
    }
}
