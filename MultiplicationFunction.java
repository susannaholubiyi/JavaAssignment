public class MultiplicationFunction{

	public int getProductOfTwoNumbers(int firstNumber, int secondNumber){
	
	
		if(firstNumber < 0 && secondNumber < 0){
			firstNumber = firstNumber / -1 ;
			secondNumber = secondNumber / -1 ;
		}
		else if (firstNumber < 0){
			firstNumber = firstNumber / -1 ;		
			int product = 0;
		
			for(int index = 0; index < secondNumber; index++){
			
				product += firstNumber;
			}
		
			return (- product);
		}
		
		else if (secondNumber < 0){
			secondNumber = secondNumber / -1 ;		
			int product = 0;
		
			for(int index = 0; index < secondNumber; index++){
			
				product += firstNumber;
			}
		
			return (- product);
		}
		
		int product = 0;
		
		for(int index = 0; index < secondNumber; index++){
			
			product += firstNumber;
		}
		
		return product;
	}

}
