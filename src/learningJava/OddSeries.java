package learningJava;

import java.util.Scanner;

public class OddSeries {

	public static void main(String[] args) {
		int userInput;
		int count =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the number - ");
		userInput=input.nextInt();
		for(int i=0;i<=userInput;i++)
		{ if(!(i%2==0))
			{System.out.println(i);
		count++;
		}}
  System.out.println("Total count of odd number=" + count);
	}

}
