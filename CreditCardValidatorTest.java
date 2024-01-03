import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest{

	@Test
	public void getCreditCardNumber(){
	
	CreditCardValidator creditCardValidator = new CreditCardValidator();
	
	creditCardValidator.setCreditCardNumber("5399237062594490");
	String expected = "5399237062594490";
	String actual = creditCardValidator.getCreditCardNumber();
	
	assertEquals(expected, actual);
	}
	
	
	@Test
	public void getCreditCardType(){
		
	CreditCardValidator creditCardValidator = new CreditCardValidator();
	
	creditCardValidator.setCreditCardNumber("5399237062594490");
	String actual = creditCardValidator.getCreditCardType();
	String expected = "Master Card";
	
	assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void sumOfTheDoubleOfEvenDigitsAndSumOfOddDigitsFromTheRight(){

	CreditCardValidator creditCardValidator = new CreditCardValidator();
	
	creditCardValidator.setCreditCardNumber("5399237062594490");
	int actual = creditCardValidator.sumOfTheDoubleOfEvenDigitsAndSumOfOddDigitsFromTheRight();
	int expected = 70;
	
	assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void creditCardValidityStatus(){
	
	CreditCardValidator creditCardValidator = new CreditCardValidator();

	creditCardValidator.setCreditCardNumber("5399237062594490");	
	creditCardValidator.getCreditCardType();
	creditCardValidator.sumOfTheDoubleOfEvenDigitsAndSumOfOddDigitsFromTheRight();
	String actual = creditCardValidator.creditCardValidityStatus();
	String expected = "Valid";
	
	assertEquals(expected, actual);			
	}
}
