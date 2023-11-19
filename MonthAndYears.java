import java.util.Scanner;

  public class MonthAndYears{

   public static void main (String[] args){

    Scanner input;
     input = new Scanner(System.in);

      System.out.print("Input number of month ranging from 1 to 12: ");
       int month = input.nextInt();

        System.out.print("Input year: ");
         int year= input.nextInt();

         int leapYear= year%4;

          if (month==1 && year<2023) System.out.printf("January %d had 31 days", year);

           if (month==2 && leapYear!=0) System.out.printf("%nFebuary %d had 28 days", year);
      
            if (month==3 && year<2023) System.out.printf("%nMarch %d had 31 days", year);

             if (month==4 && year<2023) System.out.printf("%nApril %d had 30 days", year);

              if (month==5 && year< 2023) System.out.printf("%nMay %d had 31 days", year);

               if (month==6 && year<2023) System.out.printf("%nJune %d had 30 days", year);

                if (month==7 && year<2023)System.out.printf("%nJuly %d had 31 days", year);

                 if (month==8 && year<2023) System.out.printf("%nAugust %d had 31 days", year);
             
                  if (month==9 && year<2023) System.out.printf("%n September%d had 30 days", year);
  
                   if (month==10 && year<2023) System.out.printf ("%n October %d had 31 days", year);
 
                    if (month==11 && year< 2023) System.out.printf("%nNovember %d had 30 days", year);

                     if (month==12 && year< 2023) System.out.printf("%nDecember %d had 31 days", year);


        
          if (month==1 && year>=2023) System.out.printf("January %d has 31 days", year);
      
            if (month==3 && year>=2023) System.out.printf("%nMarch %d has 31 days", year);

             if (month==4 && year>=2023) System.out.printf("%nApril %d has 30 days", year);

              if (month==5 && year>=2023) System.out.printf("%nMay %d has 31 days", year);

               if (month==6 && year>=2023) System.out.printf("%nJune %d has 30 days", year);

                if (month==7 && year>=2023)System.out.printf("%nJuly %d has 31 days", year);

                 if (month==8 && year>=2023) System.out.printf("%nAugust %d has 31 days", year);
             
                  if (month==9 && year>=2023) System.out.printf("%n September%d has 30 days", year);
  
                   if (month==10 && year>=2023) System.out.printf ("%n October %d has 31 days", year);
 
                    if (month==11 && year>=2023) System.out.printf("%nNovember %d has 30 days", year);

                     if (month==12 && year>=2023) System.out.printf("%nDecember %d has 31 days", year);



               if (month==2 && leapYear==0) System.out.printf("%n Febuary %d has 29 days", year);



  }
}