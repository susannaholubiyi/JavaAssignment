import java.util.Scanner;

  public class PositiveAndNegativeNumber{
  
    public static void main(String[] args){
    
   
      Scanner input = new Scanner(System.in);
      
        System.out.print("Enter an integer, the input ends if it is 0: "); 
        
        int number = input.nextInt();
        
          int sum = 0;
          
          int positiveCounter = 0;
          
          int negativeCounter = 0;
         
          int counter = 0;
         
         
          
          while (number != 0) {
          
          sum += number;
          
          if(number > 0){
          positiveCounter ++;
          
          	}
          
          if (number < 0){
          negativeCounter ++;
          
          	}
          
         if ((number<0) || (number > 0)){
         counter ++;
                   
          	}
          System.out.print("Enter an integer, the input ends if it is 0: ");
          number = input.nextInt();
          }
          
          double average = (double) sum/ counter;
          
    System.out.printf("The number of positives is %d ", positiveCounter);
    System.out.printf("%nThe number of negatives is %d " , negativeCounter);
    System.out.printf("%nThe sum is %d ", sum);
    System.out.printf("%nThe average is %.2f " ,average );
    
   
  
     }
  
  }
