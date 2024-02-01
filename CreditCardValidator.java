import java.util.Scanner;
public  class CreditCardValidator{

  private static Scanner scanner = new Scanner(System.in);
  private String creditCardNumber;
  private String creditCardType;

    
    public void setCreditCardNumber(String creditCardNumber){
  	
   	int length = creditCardNumber.length();
    
   		while (length < 13 || length > 16) {
    				System.out.println("Card number digits should be between 13 and 16");
    				System.out.println("Hello, kindly enter card details to verify: ");	
        			creditCardNumber = scanner.next();
        			length = creditCardNumber.length();
        	}
        	
        			this.creditCardNumber = creditCardNumber;
        			
    		
    	
    }
    	
    		
    public String getCreditCardNumber(){
    	return creditCardNumber;
    }
    
  
    
    
    public String getCreditCardType(){
    	char[] creditCardDigits = new char[creditCardNumber.length()];
    	
    	for(int index = 0; index < creditCardDigits.length; index++){
    		creditCardDigits[index] = getCreditCardNumber().charAt(index);
    		
    	}
    	if (creditCardDigits[0] == '4'){
    		creditCardType = "Visa Card";
    		}
    	else if (creditCardDigits[0] == '5'){
    		creditCardType = "Master Card";
    		}
    	else if ((creditCardDigits[0] == '3') && (creditCardDigits[1] == '7')){
    		creditCardType = "American Express Card";
    		}
    	else if (creditCardDigits[0] == '6'){
    		creditCardType = "Discovery card";
    		}
    	else{ creditCardType = "Invalid Card";
    		}
   	return creditCardType;
    }
    
    
    public int sumOfTheDoubleOfEvenDigitsAndSumOfOddDigitsFromTheRight(){
    	long newCreditCardNumber = Long.parseLong(creditCardNumber);
    	int[] listOfCreditCardDigit = new int[creditCardNumber.length()];
    	int count = creditCardNumber.length() -1;
    	
    	for(int index = 0; index < listOfCreditCardDigit.length; index++){
    		listOfCreditCardDigit[count] = (int) (newCreditCardNumber % 10);
    		newCreditCardNumber /= 10;
    		count--;
    	}
    	int doubleOfEvenPositionDigits = 0;
	int sum = 0;
	
	
	for(int index = listOfCreditCardDigit.length - 2; index >= 0; index -= 2){
	
		doubleOfEvenPositionDigits = listOfCreditCardDigit[index] * 2;
		
		if(doubleOfEvenPositionDigits > 9){
			int secondDigit = doubleOfEvenPositionDigits % 10;
			int firstDigit = doubleOfEvenPositionDigits / 10;
			doubleOfEvenPositionDigits = firstDigit + secondDigit;
			}
			
		sum += doubleOfEvenPositionDigits;
	
	}
			
	for(int index = listOfCreditCardDigit.length - 1; index >= 1; index -= 2){
		sum += listOfCreditCardDigit[index];
	}
	return sum;
    }
    
    
    public String creditCardValidityStatus(){
    	String cardValidityStatus = "null";
    	if (creditCardType.equals("Invalid card")){
    		cardValidityStatus = "Invalid";
    	}
    	else if (sumOfTheDoubleOfEvenDigitsAndSumOfOddDigitsFromTheRight() % 10 == 0){
    		cardValidityStatus = "Valid";
    	}
    	else{
    		cardValidityStatus = "Invalid";
    	}
    return cardValidityStatus;
    }
}





