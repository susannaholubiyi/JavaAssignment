import java.util.Scanner;
 
  public class Multiples{
   public static void main(String[] args){

    Scanner input= new Scanner(System.in);

     System.out.print("Input first number: ");
      int firstInteger= input.nextInt();

       System.out.print("Input second number: ");
        int secondInteger= input.nextInt();


         int tripleFirstInteger= 3*firstInteger;

           int doubleSecondInteger= 2*secondInteger;

            int remainder= doubleSecondInteger%tripleFirstInteger;

             if (remainder==0) System.out.print("First number tripled is a multiple of second number doubled");
         
           else System.out.print ("First number tripled is not a multiple of second number doubled");

}
}