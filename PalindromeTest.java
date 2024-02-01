import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest{


	@Test
	public void testThatStringIsAPalindrome(){
	Palindrome palindrome = new Palindrome();
	String[] word = {"abba"};
	String reversedWord = palindrome.checkIfPalindrome(word);
	
	String expected = "It is a palindrome";
	assertEquals(expected, reversedWord);
	}
	
	@Test
	public void testThatNumberIsAPalindrome(){
	Palindrome palindrome  = new Palindrome();
	int[] number = {1321};
	String reversedNumber = palindrome.checkIfPalindrome(number);
	
	String expected = "It is not a palindrome";
	assertEquals(expected, reversedNumber);
	
	
	}

}
