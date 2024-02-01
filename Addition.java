import java.util.Scanner;
public class Addition{

  public static void main(String... args){
  
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int count = 0;
	
	int[] numbers = new int[3];
	
	while (count < numbers.length){
	System.out.println("Enter number: ");
	numbers[count] = input.nextInt();
	sum = sum + numbers[count];
	count++;
	
	}
	System.out.print("The sum of ");
	
	//for(int index = 0; index < numbers.length; index++){
	//System.out.print(numbers[index] + " ");
	
	//}
	
	for (int number:numbers){
	System.out.print(number +  " ");
	}
	System.out.printf("is %d%n ", sum);
	
	}
	}
