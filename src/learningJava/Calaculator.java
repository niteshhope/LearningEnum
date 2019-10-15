package learningJava;

import java.util.Scanner;

public class Calaculator {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter First number=");
		firstNumber=userInput.nextInt();
		System.out.print("Enter Second number=");
		secondNumber=userInput.nextInt();

		Multiplication multiply = new Multiplication();

		System.out.println("Sum of Two Number = "+ addInterger(firstNumber, secondNumber));
		System.out.println("Subtractyion of two Number="+ Subtraction.subract(firstNumber, secondNumber));
		System.out.println("Multiplcation of Two Number="+ multiply.multiplyNumber(firstNumber,secondNumber));
		System.out.println("Divsion of two Number =" + firstNumber/secondNumber);
	}

	public static int addInterger(int firstNumber, int secondNumber)
	{
		return firstNumber +secondNumber;

	}

}