import java .util.Scanner;
  public class DivisibleBy5or6{

   public static void main(String[] args){

    Scanner input;
    input= new Scanner(System.in);

     System.out.print("Enter first integer: ");
      int integer= input.nextInt();


         if (integer%5==0)(integer%6==0){ System.out.printf("Is %d divisible by 5 and 6?= True", integer);

          else System.out.print("Is %d divisible by 5 and 6?= False", integer);
}
          if (integer%6!=0) (integer%5==0){ System.out.print("Is %d divisible by 5 or 6?= True", integer);
}

           if (integer%6==0) (integer%5!=0){ System.out.print("Is %d divisible by 5 or 6 but not both?= True", integer);

            


  }




}