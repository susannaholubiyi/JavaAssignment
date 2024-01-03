public class SumOfList{


	public int sumNumbers(int[] numbers){
	int sum = 0;
	
	
	for(int index = 0; index < numbers.length; index ++){
	
		sum += numbers[index];
	}
	
	return sum;
	}



	public int sumNumbers(int[] numbers){
	
	int sum = 0;
	int index = 0;
	
	while(index < numbers.length){
	
		sum += numbers[index];
		index++;
	}
	return sum;
	}
	
	
	
	public int sumNumbers(int[] numbers){
	
	int sum = 0;
	int index = 0;
	do {
	sum +=numbers[index];
	index++;
	}while(index < numbers.length);

	return sum;
	}
}
