import java.util.Scanner;
 public class Comparision{
 
  public static void main(String[] args){

   Scanner input;
    input= new Scanner(System.in);
     
     System.out.print("Input first integer: ");
      int firstInteger= input.nextInt();

       System.out.print("Input second integer: ");
        int secondInteger= input.nextInt();

         System.out.print("Input third integer: ");
          int thirdInteger= input.nextInt();

           int sum= firstInteger + secondInteger + thirdInteger;
            System.out.printf("Sum of integers is %d%n", sum);

             int average= sum/3;
              System.out.printf("Average of integers is %d%n", average);
 
               int product= firstInteger*secondInteger*thirdInteger;
                System.out.printf("Product of integers is %d", product);

                 if (firstInteger > secondInteger && firstInteger > thirdInteger) System.out.printf ("%d is the Largest number", firstInteger);

                  if (secondInteger > firstInteger && secondInteger > thirdInteger) System.out.printf ("%n%d is the Largest number", secondInteger);

                   if (thirdInteger > firstInteger && thirdInteger > secondInteger) System.out.printf("%n%d is the Largest number", thirdInteger);

                    if (firstInteger < secondInteger && firstInteger < thirdInteger) System.out.printf("%n%d is the Smallest number", firstInteger);

                     if (secondInteger < firstInteger && secondInteger < thirdInteger) System.out.printf("%n%d is the Smallest number", secondInteger);

                      if (thirdInteger < firstInteger && thirdInteger < secondInteger) System.out.printf("%n%d is the Smallest number", thirdInteger);

           



    }

}