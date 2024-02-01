import java.util.Scanner;

 public class AccountTestModified{
 
  public static void main(String[] args){

    Scanner input;
     input = new Scanner(System.in);

      Account account = new Account("Susannah",10.0);

       System.out.print("Enter your name: ");
        String name = input.nextLine();
         account.setName();

          System.out.printf("%n%s Your initial balance is $%.2f: ", newParameter.getName(), newParameter.getBalance());
           
           
            System.out.println("Enter deposit amount: ");
             double depositAmount = input.nextDouble();
              account.deposit(depositAmount);

               displayAccount(account);

                System.out.println("Enter withdrawal amount: ");
                 double withdrawAmount = input.nextDouble();
                  account.withdraw(withdrawAmount);
                  

                   

         
 

    }
  public static void displayAccount(modifiedAccount newParameter){

   System.out.printf("%n%s Your initial balance is $%.2f: ", newParameter.getName(), newParameter.getBalance());
           
   
    System.out.printf("%n%s Your new balance is $%.2f: ", newParameter.getName(), newParameter.getBalance());


}
}