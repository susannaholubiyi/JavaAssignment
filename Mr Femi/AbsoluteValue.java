import java.util.Scanner;

public class AbsoluteValue{

  public static void main(String[] args){

    Scanner input;
    input = new Scanner(System.in);
    
    System.out.print("Enter a number to get the absolute value: ");
    int number = input.nextInt();
    
    if (number > 0 ) 
    System.out.printf("Absolute value of %d = %d%n", number, number);
    
    else if ( number < 0)
    System.out.printf("%nAbsolute value of %d = %d%n", number, ((-1) * number) );
    
    else if (number == 0)
    System.out.println(" Invalid");



  }
}
