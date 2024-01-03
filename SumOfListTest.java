import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfListTest{

	@Test
	public void testThatSumNumbersInAList(){
	
	SumOfList sumOfList = new SumOfList();
	
	int[] numbers = {1, 2, 3, 4, 5};
	int sumOfNumbers = sumOfList.sumNumbers(numbers);
	int expected = 15;
	assertEquals(expected, sumOfNumbers);
	
	}
	
	/**@Test
	public void testThatSumDoublesInAList(){

	SumOfList sumOfList = new SumOfList();
	
	double[] decimals = {1.1, 2.2, 3.3};
	double sumOfDecimals = sumOfList.sumDecimals(decimals);
	double expected = 6.6;
	assertEquals(expected, sumOfDecimals);
	}**/

}
