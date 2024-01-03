import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EvenPositionElementTest{


	@Test
	public void testThatDisplaysElementsOnOddPosition(){
	
	EvenPositionElement evenPositionElement = new EvenPositionElement();
	
	char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	char[] lettersInEvenPosition = evenPositionElement.evenLetter(letters);
	
	char[] expected = {'b', 'd', 'f'};
	
	assertArrayEquals(expected, lettersInEvenPosition);
	
	}

}
