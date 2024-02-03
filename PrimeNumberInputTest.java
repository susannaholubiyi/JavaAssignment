import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PrimeNumberInputTest{

	@Test
	public void testPrimeNumberInputGetter(){
	
	PrimeNumberInput primeNumberInput = new PrimeNumberInput();
	int expected = 7;
	int actual = primeNumberInput.primeNumberInputGetter();
	
	assertEquals(expected, actual);
	
	
	}
}
