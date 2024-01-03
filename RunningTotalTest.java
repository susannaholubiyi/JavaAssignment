import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RunningTotalTest{

	@Test
	public void testThatComputesTheRunningTotalOfAList(){
	RunningTotal runningTotal = new RunningTotal();
	
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] listContainingRunningTotal = runningTotal.runningTotalOfNumbers(numbers);
	
	int[] expected = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55};
	assertArrayEquals(expected, listContainingRunningTotal);
	
	
	}
	
	

}
