import java.util.Scanner;

  public class PositiveAndNegativeNumber{
  
    public static void main(String[] args){
    
   
      Scanner input = new Scanner(System.in);
      
        System.out.print("Enter an integer, the input ends if it is -1: "); 
        
        int number = input.nextInt();
      

          int sum = 0;
      
          int positiveCounter = 0;
          
          int negativeCounter = 0;

          int zeroCounter = 0;
         
          int counter = 0;
         
         
          
          while (number != -1) {
          
          sum += number;
          
          if(number > 0){
          positiveCounter ++;
          
          	}
          
          if (number < 0){
          negativeCounter ++;
          
          	}

         if (number == 0 ){
           zeroCounter ++;
           
         }
          
         if ((number<0) || (number > 0) || (number == 0)){
         counter ++;
                   
          	}
          System.out.print("Enter an integer, the input ends if it is -1: ");
          number = input.nextInt();
          }
          
          double average = (double) sum/ counter;
          
    System.out.printf("The number of positives is %d ", positiveCounter);
    System.out.printf("%nThe number of negatives is %d " , negativeCounter);
    System.out.printf("%nThe number of zeros is %d ", zeroCounter);
    System.out.printf("%nThe sum is %d ", sum);
    System.out.printf("%nThe average is %.2f " ,average );
    
   
  
     }
  
  }
