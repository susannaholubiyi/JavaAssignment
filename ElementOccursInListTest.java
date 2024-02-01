import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ElementOccursInListTest{

	@Test
	public void testThatIntegerOccursInAList(){
	
	ElementOccursInList element = new ElementOccursInList();
	
	int[] numbers = {1, 2, 3, 4, 5, 6};
	int number = 9;
	boolean numberToBeCompared = element.compareNumber(numbers, number);
	
	assertEquals(false, numberToBeCompared);
	
	
	}
	
	@Test
	public void testThatStringOccursInAList(){
	
	ElementOccursInList element = new ElementOccursInList();
	
	String[] words = {"i", "am", "a", "girl"};
	String word = "girl";
	
	boolean wordToBeCompared = element.compareWord(words, word);
	assertEquals(true, wordToBeCompared);
	
	
	}
	
	@Test
	public void testThatDoubleOccursInAList(){
	
	ElementOccursInList element = new ElementOccursInList();
	
	double[] decimals = {1.1, 2.2, 3.3, 4.4, 5.5};
	double decimal = 6.6;
	
	boolean decimalToBeCompared = element.compareDecimal(decimals, decimal);
	assertEquals(false, decimalToBeCompared);
	}
	
	@Test
	public void testThatCharOccursInAList(){
	
	ElementOccursInList element = new ElementOccursInList();
	
	char[] characters = {'a', 'e', 'i', 'o', 'u'};
	char character = '$';
	
	boolean charToBeCompared = element.compareChar(characters, character);
	assertEquals(false, charToBeCompared);
	}




}
