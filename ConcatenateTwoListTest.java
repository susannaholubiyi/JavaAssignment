import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcatenateTwoListTest{

	@Test
	public void testThatConcatenatesTwoStrings(){
	
	Concatenates concatenates = new Concatenates();
	
	String[] letters = {"a", "b", "c", "d", "e"};
	String[] numbers = {"1", "2", "3", "4"};
	
	String[] listsToBeConcatenated = concatenates.concatenateTwoList(letters, numbers);
	String[] expected = {"a", "b", "c", "d", "e", "1", "2", "3", "4"};
	assertArrayEquals(expected, listsToBeConcatenated);
	
	
	
	}

}
