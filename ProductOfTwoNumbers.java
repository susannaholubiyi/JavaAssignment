import java.util.Scanner;
public class ProductOfTwoNumbers{

    public static void main(String... args){
    
    	Scanner input = new Scanner(System.in);
    	MultiplicationFunction productGetter = new MultiplicationFunction();
    	
    	System.out.print("Enter two numbers: ");
    	int firstNumber = input.nextInt();
    	int secondNumber = input.nextInt();
    	
    	
    	System.out.println(productGetter.getProductOfTwoNumbers(firstNumber, secondNumber));
    }

}
