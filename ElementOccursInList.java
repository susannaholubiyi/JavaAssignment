public class ElementOccursInList{


	public boolean compareNumber (int[] numbers, int element){
	int index = 0;
	
		while(index < numbers.length){
		

	
			if(element == numbers[index]){
				
				return true;
				
	
			}

	
			
			index ++;
	
		}
		return false;
	
	}
	
	
	public boolean compareWord (String[] words, String word){
	
		for(int index = 0; index < words.length; index ++){
	
			if (word.equals(words[index])){
			return true;
			
		}

		}
	
	return false;
	
	
	}
	
	public boolean compareDecimal (double[] decimals, double decimal){
	
		for(int index = 0; index <decimals.length; index++){
		
			if(decimal == decimals[index]){
			return true;
			}
		
		}
	
	return false;
	}
	
	
	public boolean compareChar (char[] characters, char character){
	
		for(int index = 0; index < characters.length; index++){
		
			if(character == characters[index]){
			return true;
			}
		}
		
	return false;
	}
}
