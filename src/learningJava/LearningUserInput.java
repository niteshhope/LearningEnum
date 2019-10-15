package learningJava;

import java.util.Scanner;

public class LearningUserInput {
public static void main(String[] args) {
    	
    	
		Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
    	int number1 = input.nextInt();
    	System.out.println("You entered " + number1);
    	System.out.print("Enter an integer: ");
    	int number2 = input.nextInt();
    	System.out.println("You entered " + number2);
    	System.out.println(number1*number2);
    }

}
