import java.util.Scanner;
public class CarApplication{
 
 public static void main(String[] args){

 Scanner input;
  input = new Scanner(System.in);


   Car myFirstCar = new Car("Ferrari", "2022", 50000000.00);

    Car mySecondCar = new Car ("Lamboghini", "2020", 70000000.00);


     System.out.printf("These are the information of our first car: %s %s %.2f %n", myFirstCar.getModel() ,myFirstCar.getYear() , myFirstCar.getPrice()); 

      System.out.printf("%nThese are the information of our second car: %s %s %.2f", mySecondCar.getModel() , mySecondCar.getYear() , mySecondCar.getPrice());

       
       System.out.print("\nEnter the price at which you want to buy first car: ");
        double price = input.nextDouble();
        


       System.out.println("Type 'Yes' to apply a five percent discount on the first car or 'No' if you don't: ");
	String answer = input.next();
         if (answer.equalsIgnoreCase("yes")){
		 myFirstCar.setPrice(price);
          System.out.printf("You got a five percent discount on our Ferrari! Your discounted price is: %.2f", myFirstCar.getFivePercentDiscount() );
         
	}
           if (answer.equalsIgnoreCase("no")){
            System.out.print("\nEnter the price at which you want to buy second car: ");
             double price2 = input.nextDouble();


              System.out.println("Type 'Yes' to apply a seven percent discount on the second car or 'No' if you don't: ");
               String answer2 = input.next();
                if (answer2.equalsIgnoreCase("yes")) {
                  
                 mySecondCar.setPrice(price);
                  System.out.printf("You got a seven percent discount on our Lamboghini! Your discounted price is: %.2f", mySecondCar.getSevenPercentDiscount() );
		}
                
                    else { System.out.printf("%nThanks for using our service");
		}
	}
   

       System.out.print("\nEnter the price at which you want to buy second car: ");
        double price3 = input.nextDouble();
  
         System.out.println("Type 'Yes' to apply a seven percent discount on the second car or 'No' if you don't: ");
          String answer3 = input.next();
           if (answer3.equalsIgnoreCase("yes")){
            
            mySecondCar.setPrice(price);
             System.out.printf("You got a seven percent discount on our Lamboghini! Your discounted price is: %.2f %n Thanks for your patronage! Hope to see you again!", mySecondCar.getSevenPercentDiscount() );
		}
               else { System.out.printf("%nThanks for using our service");
		}
	

         
                      







  }
}