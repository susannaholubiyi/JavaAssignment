import java.util.Scanner;

 public class AccountTest{
 
  public static void main(String[] args){

    Scanner input;
     input = new Scanner(System.in);

      Account account1 = new Account("Jane Green",50.00);
       Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%n%s your balance is: %.2f ",account1.getName(), account1.getBalance() );
         System.out.printf("%n%s your balance is: %.2f ", account2.getName(), account2.getBalance() );
           

            System.out.print("\nEnter deposit amount for account1: $");
             double depositAmount = input.nextDouble();    
              System.out.printf("%nAdding %.2f to account 1 balance: %n", depositAmount);
               account1.deposit(depositAmount);

  
                System.out.printf("%nYour balance for account1 is: %.2f ", account1.getBalance() );
                 System.out.printf("%nYour balance for account2 is: %.2f%n ", account2.getBalance() );

               
                  System.out.print("\nEnter deposit amount for account2: $");
                   depositAmount = input.nextDouble();
                    System.out.printf("%nAdding %.2f to account2 balance: ", depositAmount);
                     account2.deposit(depositAmount);


                      System.out.print("\nEnter withdrawal amount for account1: $");
                       double withdrawAmount = input.nextDouble();
                        System.out.printf("%nRemoving $%.2f from account1 balance. %n Your new balance is %.2f: ",withdrawAmount, account1.getBalance() ); 
                         account1.withdraw(withdrawAmount);

      
                          System.out.print("\nEnter withdrawal amount for account2: $");
                           withdrawAmount = input.nextDouble();
                            System.out.printf("%nRemoving $%.2f from account2 balance. %n Your new balance is %.2f: ",withdrawAmount, account2.getBalance() );
                             account2.withdraw(withdrawAmount);
                              


                   

         


    }
}