import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddPositionElementTest{

	@Test
	public void testThatDisplaysElementsOnOddPosition(){
	
	OddPositionElement oddPositionElement = new OddPositionElement();
	
	int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	int[] numbersInOddPosition = oddPositionElement.oddElement(list);	
	
	int[] expected = {1, 3, 5, 7, 9, 11};
	
	assertArrayEquals(expected, numbersInOddPosition);
	
	
	
	}


}
