import java.util.Scanner;

 public class PoundsConversion{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
     System.out.print("Enter number in Pounds in decimal: ");
      double X = input.nextDouble ();

       double conversion = 0.454 * X;
  
       System.out.printf("Kilogram equivalent is %n%.2f Kg", conversion);







}
}
 