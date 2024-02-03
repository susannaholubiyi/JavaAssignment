import java.util.Scanner;
public class ReverseNumber{

    public static void main(String... args){
    
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter a five digit number: ");
    	int number = input.nextInt();
    	String convertNumberToWord = number + "";
    	
    	while (convertNumberToWord.length() < 5 || convertNumberToWord.length() > 5){
    		System.out.print("Invalid input!");
    		System.out.print("Enter a five digit number: ");
    		number = input.nextInt();
    		convertNumberToWord = number + "";
    	}
    	
    	int length = convertNumberToWord.length();
    	char[] reversedNumber = new char[length];
	int count = length-1;
    		for(int index = 0; index < length; index++){
    		reversedNumber[count] = convertNumberToWord.charAt(index);
    		count--;
    		}
    	String finalReversedNumber = new String(reversedNumber);
    	
    	System.out.printf("The reverse is %s%n", finalReversedNumber);

    }
}
