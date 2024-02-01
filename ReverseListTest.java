import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseListTest{


	@Test
	public void testThatReverseArrayList(){
	
	ReverseList reverseList = new ReverseList();
	
	int[] numbers = {5, 4, 3, 2, 1};
	int[] numbersInReverse = reverseList.reverse(numbers);
	
	int[] expected = {1, 2, 3, 4, 5};
	
	assertArrayEquals(expected, numbersInReverse);
	
	
	}

}
