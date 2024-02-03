import java.util.Arrays;
public class AscendingOrderWithoutVariable{
    public static void main(String... args){
    
    	int[] numbers = {1, 4, 5, 2, 3};
    	System.out.print(Arrays.toString(numbers));
    	System.out.println();
    	
    	for(int index = 0; index < numbers.length; index++){
    		for(int index2 = 0; index2 < numbers.length; index2++){
    			if (numbers[index2] > numbers[index]){
    				numbers[index] += numbers[index2];
    				numbers[index2] = numbers[index] - numbers[index2];
    				numbers[index] -= numbers[index2];
    				
    				
    			}
    		
    		}
    		
    	}
    	
    	System.out.println(Arrays.toString(numbers));
    	
    }

}
