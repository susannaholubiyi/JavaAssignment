public class DisplayTimeTable{
    public static void main(String... args){	
	int numberCounter = 1;
	for(int index= 1; index <= 12; index++){
		
		int multiple = 1;
    		int counter = 1;
    		
    		for(int index2 = 1; index2 <= 12; index2++){
    			multiple = numberCounter * index2;
    			System.out.printf("%d x %d = %d\t", counter, numberCounter, multiple);
    			counter++;

    			
    		}
    		
    		System.out.println();
    		numberCounter++;
	}
    }
}
