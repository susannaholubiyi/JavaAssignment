import java.util.Scanner;

  public class PerimeterOfTriangle{

   public static void main(String[] args){

     Scanner input;
      input = new Scanner(System.in);

      System.out.print ("Enter first edge: ");
       double firstEdge = input.nextDouble();

        System.out.print("Enter second edge: ");
         double secondEdge = input.nextDouble();

          System.out.print("Enter third edge: ");
           double thirdEdge = input.nextDouble();

            double perimeter = firstEdge + secondEdge + thirdEdge;

        
        if ((firstEdge + secondEdge) > thirdEdge){ if ((firstEdge + thirdEdge) > secondEdge)  if ((secondEdge + thirdEdge) > firstEdge)

         System.out.printf(" The perimeter of the triangle is %.2f", perimeter);
          }

          else if (((firstEdge + secondEdge) < thirdEdge) && ((firstEdge + thirdEdge) < secondEdge) && ((secondEdge + thirdEdge) < firstEdge))
    
           System.out.print("Input is invalid!");
            

             else if (((firstEdge + secondEdge) == thirdEdge) && ((firstEdge + thirdEdge) == secondEdge) && ((secondEdge + thirdEdge) == firstEdge))

              System.out.print("Input is invalid");   
                   

               else if (((firstEdge + secondEdge) > thirdEdge) && ((firstEdge + thirdEdge) > secondEdge) && ((secondEdge + thirdEdge) < firstEdge))

                System.out.print("Input is invalid");  
                 

                  else if (((firstEdge + secondEdge) > thirdEdge) && ((firstEdge + thirdEdge) < secondEdge) && ((secondEdge + thirdEdge) < firstEdge))

                   System.out.print("Input is invalid");
                    

                     else if (((firstEdge + secondEdge) < thirdEdge) && ((firstEdge + thirdEdge) > secondEdge) && ((secondEdge + thirdEdge) > firstEdge))

                     System.out.print("Input is invalid");
                      

                      if ((firstEdge + thirdEdge) == secondEdge) System.out.print ("Input is invalid");

                      if ((secondEdge + thirdEdge) == firstEdge) System.out.print ("Input is invalid");

                      if ((firstEdge + secondEdge) == thirdEdge) System.out.print ("Input is invalid");



                       if (((firstEdge + secondEdge)> thirdEdge) && ((firstEdge + thirdEdge) < secondEdge) && ((secondEdge + thirdEdge) > firstEdge))

                       System.out.print("Input is invalid");

   
                     







  }
}