import java.util.Arrays;
public class DescendingOrderArray{

    public static void main(String... args){
    
    	int[] numbers = {1, 2, 3, 4, 5};
    	System.out.print(Arrays.toString(numbers));
    	System.out.println();
    

    	for(int index = 0; index < numbers.length; index++){
    		for(int index2 = index + 1 ; index2 < numbers.length; index2++){
    			if(numbers[index] < numbers[index2]){
    			int descending = numbers[index];
    			numbers[index] = numbers[index2];
    			numbers[index2] = descending;

    			}

    		}

    	}
    	
    	System.out.print(Arrays.toString(numbers));
    	
    
    
    
    
    }
}
