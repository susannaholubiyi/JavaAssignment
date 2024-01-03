public class Concatenates{

	public String[] concatenateTwoList(String[] letters, String[] numbers){
	
	int newLength = letters.length + numbers.length;
	
	String[] newArray = new String[newLength];
	int count = 0;
	for (int index =0; index < letters.length; index++){
	newArray[count] = letters[index];
	count++;
	}
	
	int counter = letters.length;
	for (int index = 0; index < numbers.length; index++){
	newArray[counter] = numbers[index];
	counter++;
	}
	
	
	return newArray;
	}
	
	
}
