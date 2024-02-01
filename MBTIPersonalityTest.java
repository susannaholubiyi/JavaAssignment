import java.util.Scanner;
public class MBTIPersonalityTest{

    public static void main(String... args){
    
     Scanner input = new Scanner(System.in);
    
    	MBTI mbti = new MBTI();
    	mbti.storePersonalityTestQuestions();
    	System.out.print("What is your name? \n");
    	String name = input.next();
    	mbti.getPersonalityTestQuestions();
    	mbti.personalityTypeGroup();
    	
	System.out.printf("%nHello %s you selected%n", name);
	mbti.getMBTIResult();
	
	
    }
}
