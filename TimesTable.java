import java.util.Scanner;

  public class TimesTable{
  
    public static void main(String[] args){
    
      Scanner input;
      input = new Scanner(System.in);
      

            
      System.out.print("Input a number from 1-10 to get the time table: ");
      
      int number = input.nextInt();
      
      int counter = 1;
      
      
      if ((number < 1) || (number >10)){
   		System.out.println("Please enter a number from 1-10");
  		
  		
  		}
   
  
   	         
   	   		
   		else if ((number >= 1) && (number <= 10)){
   		
   		while(counter <= 12){
   		System.out.printf("%d x %d = %d%n", number, counter, (number * counter));
   		 counter ++;
   		  }

   	
		
  		
  
 	}
  
 		//if ((number < 1) && (number >10)){
   		//System.out.println("Please enter a number from 1-10");
  		//}
  
  
  
  
  }
}
