public class ConvertNumberToList{

	public int[] convertToList(int number){
	
	if (number < 0){
	number *= -1;
	}
	String word = number + "";
	int length = word.length();
	int[] newArray = new int[length];
	int count = length - 1;
		for(int index = length - 1; index >= 0; index--){
		newArray[count] = number % 10;
		number /= 10;
		count--;
		}
	return newArray;	
	}
}
