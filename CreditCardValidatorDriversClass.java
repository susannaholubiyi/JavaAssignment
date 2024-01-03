import java.util.Scanner;
public class CreditCardValidatorDriversClass{

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	CreditCardValidator creditCardValidator = new CreditCardValidator();
	System.out.println("Hello, kindly enter card details to verify: ");
	String card = scanner.next();
	creditCardValidator.setCreditCardNumber(card);
	
	
	System.out.println("*****************************************");
	System.out.println("**Credit Card Type: " + creditCardValidator.getCreditCardType());
	System.out.println("**Credit Card Number: " + creditCardValidator.getCreditCardNumber() );
	System.out.println("**Credit Card Digit Length: " + card.length() );
	System.out.println("**Credit Card Validity Status: " + creditCardValidator.creditCardValidityStatus() );
	System.out.println("*****************************************");
	

	}
}
