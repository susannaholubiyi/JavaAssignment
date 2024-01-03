public class CombineTwoList{

	public Object[] combineList(String[] letters, int[] numbers){
	
	int newLength = letters.length + numbers.length;
	
	Object[] newArray = new Object[newLength];
	
	int count = 0;
	int index = 0;
	int index2 =0; 
	
	while(index < letters.length && index2 < numbers.length){ 
	
		newArray[count++] = letters[index];
		newArray[count++] = numbers[index2];

		index++;
		index2++;
	
	}
	
	while(index < letters.length){
		newArray[count++] = letters[index++];
	
	}
	
	while(index2 < numbers.length){
		newArray[count++] = numbers[index2++];
	}
	return newArray;
	}
}
