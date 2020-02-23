package calculator;
import java.util.Scanner;

public class MainClass {

	public static float userNumber1;
	public static float userNumber2;
	public static float answer;
	public static int operation;
	public static boolean continueMath = false;
	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World");
		System.out.println("What is your first number?");
		userNumber1 = userInput.nextFloat();
		
		Math();			
	}
	
	static void Math()
	{		
		
		System.out.println("What is your second number?");		
		userNumber2 = userInput.nextFloat();
		
		System.out.println("What should i do with this number?");
		System.out.println("1 = +, 2 = -, 3 = *, 4 = /");
		operation = userInput.nextInt();
		
		switch (operation)
		{
		case 1 : 
			answer = userNumber1 + userNumber2;
			System.out.println("Answer is " + answer);
			userNumber1 = answer;
			break;
		case 2 : 
			answer = userNumber1 - userNumber2;
			System.out.println("Answer is " + answer);
			userNumber1 = answer;
			break;
		case 3 : 
			answer = userNumber1 * userNumber2;
			System.out.println("Answer is " + answer);
			userNumber1 = answer;
			break;
		case 4 : 
			answer = userNumber1 / userNumber2;
			System.out.println("Answer is " + answer);
			userNumber1 = answer;
			break;
		}
		
		System.out.println("Do you want to do something else with this number?");
		System.out.println("true or false");
		continueMath = userInput.nextBoolean();
		
		if(continueMath = true)
		{
			Math();
		}
		else 
		{
			System.out.println("Alright, see you next time");
		}
	}
}		