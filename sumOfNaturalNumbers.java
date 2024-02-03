
public class sumOfNaturalNumbers{
public static void main(String... arg){

		int[] firstTenNaturalNumbers = new int[11];
		int sum = 0;
	
		for(int index = 0; index < firstTenNaturalNumbers.length;index++){
			sum += index;
		}
		
		System.out.print("Sum of the first ten natural numbers is: " + sum);
	
	}
	


}


