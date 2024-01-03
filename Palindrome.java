public class Palindrome{

	public String checkIfPalindrome(String[] word){
	
	String palindromeWord = word[0] + "";
	StringBuilder reverseWord = new StringBuilder(palindromeWord);
	String reversedWord = reverseWord.reverse().toString();
	
	String result = "null";
	int count =0;
	
		if (palindromeWord.equals(reversedWord)){

			result = "It is a palindrome";
		}else{

			result = "It is not a palindrome";
		}
		count++;

	return result;
	}
	
	
	public String checkIfPalindrome(int[] number){
	
	int newNumber = number[0];
	
	String numberConvertedToWord = newNumber + "";
	int length = numberConvertedToWord.length();
	
	char[] reversedNumber = new char[length];
	int count = length-1;
	
		for(int index = 0; index < length; index++){
		reversedNumber[count] = numberConvertedToWord.charAt(index);
		count --;
		}
		String newReversedNumber = new String(reversedNumber);


	String result = "null";		
		 	if (numberConvertedToWord.equals(newReversedNumber)){
		 	
		 		result = "It is a palindrome";
		 	}else{
				result = "It is not a palindrome";
				
			}		 
	 return result;
	}
}
