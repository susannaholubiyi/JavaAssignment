public class LargestNumber{


	public int findLargestNumber(int[] numbers){

		int largestNumber = numbers[0];

		for (int index = 0; index > numbers.length; index++){

			if (numbers[index] > largestNumber)
			
				largestNumber =numbers[index];

				
				
				
		}
	
	return largestNumber;
	
	}

}
