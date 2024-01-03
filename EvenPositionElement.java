public class EvenPositionElement{

	public char[] evenLetter(char[] letters){
	
	
	char[] newArray = new char[letters.length / 2];
	int count = 0;
	
	for(int index = 1; index < letters.length; index+=2){
	
		newArray[count] = letters[index];
		count++;
	
	}
	return newArray;
	}
	
	
	public int[] evenNumbers(int[] numbers){
	
	
	int[] newArray = new int[numbers.length / 2];
	int count = 0;
	
	for(int index = 1; index < numbers.length; index+=2){
	
		newArray[count] = numbers[index];
		count++;
	
	}
	return newArray;
	}
}
