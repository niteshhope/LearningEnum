package learningJava;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		int userInput; 
		int multipleNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of your chocie:- ");
		userInput = input.nextInt();
		oddEven type = new oddEven();
		System.out.println(" Enter number by user is =" + type.typeOfNumber(userInput));
		System.out.print("Enter Number to print it's multiple");
		multipleNumber=input.nextInt();
		MutipleOfNumber multiple = new  MutipleOfNumber();
		multiple.table(multipleNumber);
	}	

}
