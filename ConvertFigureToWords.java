import java.util.Scanner;

  public class ConvertFigureToWords{

   public static void main(String[] args){

    Scanner input;
     input= new Scanner(System.in);

      System.out.print ("Enter number: ");
       int number= input.nextInt();

        if (number==1) System.out.println ("One");
         if (number== 2) System.out.println ("Two");
          if (number== 3) System.out.println ("Three");
           if (number==4) System.out.println ("Four");
            if (number==5) System.out.println ("Five");
             if (number==6) System.out.println ("Six");
              if (number==7) System.out.println ("Seven");
               if (number==8) System.out.println ("Eight");
                if (number==9) System.out.println ("Nine");
                 if (number==10) System.out.println ("Ten");


}


}