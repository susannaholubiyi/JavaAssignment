import java.util.Scanner;

  public class HighestNameAndScore{

   public static void main(String[] args){ 
   
     
     Scanner input;
     input = new Scanner(System.in);
     
     System.out.print("Enter number of students: ");
     int numberOfStudents = input.nextInt();
     
     System.out.print("Enter student's name or null to quit: ");
     String studentName = input.next();
     
     System.out.print("Enter student's score or -1 to quit: ");
     double studentScore = input.nextDouble();
     
     
     String highestName = "";
     double highestScore = 0;
     int counter = 0;
     
     highestName = studentName;
     highestScore = studentScore;
     
     
     	while (studentScore != -1) {
     		
     		counter ++;
     		
     		     		
     		if (studentScore > highestScore){
     		highestScore = studentScore;
     		highestName = studentName;
     		}
     		
     		
     System.out.print("Enter student's name or null to quit: ");
     studentName = input.next();
     
     System.out.print("Enter student's score or -1 to quit: ");
     studentScore = input.nextDouble();
     
     //System.out.print("Student" + (counter++)  + "name:");
        //  studentName = input.next();
          
          
    // System.out.print ("Score: ");
    	 //studentScore = input.nextDouble();
    	 
    	 
    	// if (studentScore > highestScore){
     		//highestScore = studentScore;
     		//highestName = studentName;
     		//}
     
     	
     	}
     	
     System.out.printf("Student with highest score: %s ", highestName);
     System.out.printf("%n Highest score: %.2f %n", highestScore);
     		
     		
     		
     
     



   }

}
