import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertNumberToListTest{

	@Test
	public void testThatConvertNumberToList(){
	
	ConvertNumberToList convertNumberToList = new ConvertNumberToList();
	
	int number = -123456789;
	int[] numberConvertedToList = convertNumberToList.convertToList(number);
	int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	assertArrayEquals(expected, numberConvertedToList);
	}
}
