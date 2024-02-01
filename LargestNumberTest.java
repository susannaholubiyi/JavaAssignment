import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LargestNumberTest{


	@Test
	public void testThatFindsTheLargestNumberInArray(){
	LargestNumber largestNumber = new LargestNumber();
	
	int[] numbers = {1, 2, 6, 4, 8, 10};
	int largest = largestNumber.findLargestNumber(numbers);
	int expected = 10;
	assertEquals (expected, largest);
	
	
	}


}
