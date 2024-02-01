import java.util.Scanner;

public class ClockTest{

  public static void main(String[] args){
 
   Scanner input = new Scanner(System.in);
   
    Clock clock = new Clock(00, 00, 00);

     System.out.print("Enter number of hours: ");
      int hour = input.nextInt();
       clock.setHour(hour);

        System. out.print("\nEnter number of minutes: ");
         int minute = input.nextInt();
          clock.setMinute(hour);

           System.out.print("\nEnter number of second: ");
            int second = input.nextInt();
             clock.setSecond(second);

      
       System.out.println(clock.displayTime());
       


  }
}