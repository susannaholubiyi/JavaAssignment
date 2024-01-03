public class RunningTotal{

	public int[] runningTotalOfNumbers(int[] numbers){
	
	int[] newArray = new int[numbers.length];
	int count = 0;
	int sum = 0;
	
	for(int index = 0; index < numbers.length; index++){
		
		sum += numbers[index];
		newArray[count] = sum;
		count++;
		
		
	}
	return newArray;
	}
	
}
