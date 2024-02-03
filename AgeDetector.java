import java.util.Scanner;

public class AgeDetector{
    
    public static void main(String... argd){
    
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your year of birth: ");
	int yearOfBirth = input.nextInt();
	
	//while(!yearOfBirth.hasNext()
	while(yearOfBirth <= 0){
		System.out.println("this year is invalid");
		System.out.println("Enter your year of birth: ");
		yearOfBirth = input.nextInt();
		
	}
	
	int age = 2024 - yearOfBirth;
	
	System.out.printf("You are %d years old%n ", age);
	
    }
}
