import java.util.Scanner;

  public class ScissorsRockPaper{
   public static void main(String[] args){

    Scanner input;
     input = new Scanner(System.in);

      System.out.print("Enter player one name: ");
       String playerOneName= input.nextLine();

        System.out.print("Enter player two name: ");
         String playerTwoName= input.nextLine();

          System.out.printf("%s enter a number 0,1 or 2: ", playerOneName);
           int firstNumber= input.nextInt();

           System.out.printf("%n%s enter a number 0,1 or 2: ", playerTwoName);
            int secondNumber= input.nextInt();
           
             
             if (firstNumber==0 && secondNumber==2) System.out.printf("%n%s wins %s!", playerOneName, playerTwoName);

              if (secondNumber==0 && firstNumber==2) System.out.printf("%n%s wins %s!", playerTwoName, playerOneName);

               if (firstNumber==1 && secondNumber==0) System.out.printf("%n%s wins %s!", playerOneName, playerTwoName);
 
                if (secondNumber==1 && firstNumber==0) System.out.printf("%n%s wins %s!", playerTwoName, playerOneName);

                 if (firstNumber==2 && secondNumber==1) System.out.printf("%n%s wins %s!",playerOneName, playerTwoName);

                  if (secondNumber==2 && firstNumber==1) System.out.printf("%n%s wins %s!", playerTwoName, playerOneName);

                   if (firstNumber==secondNumber) System.out.println("\nIt's a draw!");



   }
}