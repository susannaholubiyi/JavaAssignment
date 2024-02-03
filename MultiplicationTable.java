import java.util.Scanner;
public class MultiplicationTable{

    public static void main(String... args){
    
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter any number to get it's multiplication table: ");
    	int number = input.nextInt();
    	
    	while(number <= 0){
    		System.out.println("Invalid number");
    		System.out.println("Enter any number to get it's multiplication table: ");
    		number = input.nextInt();
    	}
    
    	int multiple = 1;
    	int counter = 1;
    	for(int index = 1; index <= 12; index++){
    		multiple = number * index;
    		System.out.printf("%d x %d = %d%n", number, counter, multiple);
    		counter++;    
    	}
    
    }


}
