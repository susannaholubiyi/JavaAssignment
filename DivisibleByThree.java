import java.util.Scanner;
 
 public class DivisibleByThree {
  public static void main(String[] args){

   Scanner input;
    input= new Scanner(System.in);

     System.out.print("Input integer: ");
      int integer= input.nextInt();

       int remainderOfDivision= integer%3;

         if (remainderOfDivision==0) System.out.println("Integer is divisible by 3");

          if (remainderOfDivision!=0) System.out.println("Integer is not divisible by 3");




  }
}