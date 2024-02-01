import java.util.Scanner;

  public class DayOfTheWeek{

   public static void main(String[] args){

    Scanner input;
     input = new Scanner(System.in);

       System.out.print("Enter year(e.g 2012): ");
        int year = input.nextInt();

         System.out.print("Enter month(1-12): ");
          int month = input.nextInt();

           System.out.print("Enter the day of the month (1-31): ");
            int dayOfTheMonth= input.nextInt();
 		
             
               int y = year;
                int m = month;
                 int q = dayOfTheMonth;
			
		if (month == 1) {
		month = 13;
		year = year - 1;
	}

         if (month==2) {
                month=14;
                 year=year - 1;
        }   

                 int h = ( q + (( 13 *( m + 1)) /5) + y + (y/4) - (y /100) + (y / 400)) % 7;

                  if (h==0) System.out.print("The day of the week is Saturday");
 
                   if (h==1) System.out.println("The day of the week is Sunday");

                    if (h==2) System.out.println("The day of the week is Monday");

                     if (h==3) System.out.println("The day of the week is Tuesday");

                      if (h==4) System.out.println("The day of the week is Wednesday");

                       if (h==5) System.out.println("The day of the week is Thursday");
                    
                        if (h==6) System.out.println("The day of the week is Friday");

	








             

           

   }
}