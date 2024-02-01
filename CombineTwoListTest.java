import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CombineTwoListTest{

	@Test
	public void testThatCombinesTwoList(){
	
	CombineTwoList combineTwoList = new CombineTwoList();
	
	String[] letters = {"a", "b", "c", "d", "e", "f"};
	int[] numbers = {1, 2, 3, 4};
	Object[] listsToBeCombined = combineTwoList.combineList(letters, numbers);
	
	Object[] expected = {"a", 1, "b", 2, "c", 3, "d", 4, "e", "f"};
	assertArrayEquals(expected, listsToBeCombined); 
	
	
	}
	
	
	
}
