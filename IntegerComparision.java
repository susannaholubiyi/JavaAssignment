import java.util.Scanner;
 
 public class IntegerComparision{
  public static void main(String[] args){

   Scanner input;
    input= new Scanner(System.in);

     System.out.print("Enter number: ");
      int number= input.nextInt();
 
       int squareOfNumber= number*number;
        
     if (number>100)
      System.out.printf("%d>100", number);
   
       if (squareOfNumber>100)
        System.out.printf("%n%d>100 ", squareOfNumber);
   

         if (number==100)
          System.out.printf("%n%d==100", number);
   
           if (squareOfNumber==100)
            System.out.printf("%n%D==100", squareOfNumber);
   
     
             if(number<100)
              System.out.printf("%n%d<100", number);
   
               if (squareOfNumber<100)
                System.out.printf("%n%d<100", squareOfNumber);
   



}
}