import java.util.Scanner;

 public class AscendingOrder{

  public static void main(String[] args){

   Scanner input;
    input= new Scanner(System.in);

     System.out.print("Enter first integer: ");
      int firstInteger= input.nextInt();

       System.out.print ("Enter second integer: ");
        int secondInteger= input.nextInt();

         System.out.print("Enter third integer: ");
          int thirdInteger= input.nextInt();

           if (firstInteger < secondInteger ){ if (secondInteger < thirdInteger) System.out.printf("%d %d %d", firstInteger, secondInteger, thirdInteger);
             }

            if (firstInteger < thirdInteger){ if ( thirdInteger < secondInteger) System.out.printf("%d %d %d", firstInteger, secondInteger, thirdInteger);
             }

             if (secondInteger< firstInteger) { if (firstInteger < thirdInteger) System.out.printf("%d %d %d", secondInteger, firstInteger, thirdInteger);
              }
  
              if (secondInteger < thirdInteger) { if (thirdInteger < firstInteger) System.out.printf("%d %d %d", secondInteger, thirdInteger, firstInteger);
               }

               if (thirdInteger < firstInteger) { if ( firstInteger < secondInteger) System.out.printf ("%d %d %d", thirdInteger, firstInteger, secondInteger);
                }

                if (thirdInteger < secondInteger) { if (secondInteger < firstInteger)System.out.printf ("%d %d %d",thirdInteger, secondInteger, firstInteger);
                 }






  }
}