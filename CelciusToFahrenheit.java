import java.util.Scanner;

 public class CelciusToFahrenheit{

  public static void main (String[] args){

   Scanner input =new Scanner (System.in);

    System.out.print("Input temperature in celcius: ");

     double celcius= input.nextDouble();

       double fahrenheit=(( 9.0/5) * celcius) + 32;

        System.out.printf("%.2f is %.2f Fahrenheit", celcius, fahrenheit);

  }


}