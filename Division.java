import java.util.Scanner;
  
 public class Division{
  
   public static void main(String[] args){
  
    Scanner input =new Scanner(System.in);

     System.out.print("Input first integer");
     int firstInteger= input.nextInt();

      System.out.print("Input second integer");
       double secondInteger= input.nextDouble();

        double division= firstInteger/secondInteger;

     System.out.printf("Divisionis%n%.2f", division);

 }
}
