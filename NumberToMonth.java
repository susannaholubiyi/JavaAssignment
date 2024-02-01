import java.util.Scanner;

  public class NumberToMonth{

   public static void main(String[] args){

    Scanner inputCollector;
     inputCollector= new Scanner(System.in);

      System.out.print("Enter number: ");
       int number= inputCollector.nextInt();

        if (number==1) System.out.print("Month in english is January");

         if (number==2) System.out.print("\nMonth in english is Febuary");

          if (number==3) System.out.print("\nMonth in english is March");

           if (number==4) System.out.print("\nMonth in english is April");

            if (number==5) System.out.print("\nMonth in english is May");

             if (number==6) System.out.print("\nMonth in english is June");

              if (number==7) System.out.print("\nMonth in english is July");
               
               if (number==8) System.out.print ("\nMonth in english is August");

                if (number==9) System.out.print("\nMonth in english is September");

                 if (number==10) System.out.print("\nMonth in english is October");

                  if (number==11) System.out.print("\nMonth in english is November");

                   if (number==12) System.out.print("\nMonth in english is December");






    }


}