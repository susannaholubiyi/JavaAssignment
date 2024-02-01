import java.util.Scanner;
 public class BitFlipper{

  public static void main(String[]args){

    Scanner input;
     input= new Scanner(System.in);

      System.out.print("Input bit: ");
        int bit= input.nextInt();


        if (bit==1){
         System.out.println("0");
       }
        if(bit==0){
           System.out.println("1");
       }
         

       


}
}