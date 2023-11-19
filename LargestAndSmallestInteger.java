import java.util.Scanner;

  public class LargestAndSmallestInteger{

   public static void main(String[] args){

    Scanner input;
     input= new Scanner(System.in);

      System.out.print("Input first integer: ");
       int firstInteger= input.nextInt();

        System.out.print("Input second integer: ");
         int secondInteger= input.nextInt();

          System.out.print("Input third integer: ");
           int thirdInteger= input.nextInt();

            System.out.print("Input fourth integer: ");
             int fourthInteger= input.nextInt();

              System.out.print("Input fifth integer: ");
               int fifthInteger= input.nextInt();

           
           if (firstInteger > secondInteger) { if(firstInteger > thirdInteger) if(firstInteger > fourthInteger) if(firstInteger > fifthInteger) 

            System.out.printf("Largest integer is %d", firstInteger);
             } 

             if (secondInteger> firstInteger) { if(secondInteger > thirdInteger) if (secondInteger > fourthInteger) if ( secondInteger> fifthInteger)

              System.out.printf("Largest integer is %d", secondInteger);
               }

               if (thirdInteger > firstInteger) { if (thirdInteger > secondInteger) if(thirdInteger> fourthInteger) if (thirdInteger > fifthInteger)

                System.out.printf ("Larget integer is %d", thirdInteger);
                 }

                 if (fourthInteger> firstInteger) { if (fourthInteger> secondInteger) if (fourthInteger > thirdInteger) if (fourthInteger > fifthInteger)

                  System.out.printf ("Largest integer is %d", fourthInteger);
                   }

                    if (fifthInteger> firstInteger) { if (fifthInteger > secondInteger) if (fifthInteger > thirdInteger) if (fifthInteger > fourthInteger)

                     System.out.printf ("Largest integer is %d", fifthInteger);
      
                   }




  }

}