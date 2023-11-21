import java .util.Scanner;
  public class DivisibleByFiveOrSix{

   public static void main(String[] args){

    Scanner input;
    input= new Scanner(System.in);

     System.out.print("Enter first integer: ");
      int integer= input.nextInt();

int X = integer%5;
int Y = integer%6;


         if (X==Y && Y==0)System.out.printf("Is %d divisible by 5 and 6? True", integer);

          if (X==Y && Y==1) System.out.printf("Is %d divisible by 5 and 6? False", integer);

          if (X!=Y) System.out.printf("Is %d divisible by 5 or 6?= True", integer);


           if (Y!=X)  System.out.printf("Is %d divisible by 5 or 6 but not both?= True", integer);
     
            if (X==Y) System.out.printf ("Is %d divisible by 5 or 6 but not both? = False", integer);
            


  }




}