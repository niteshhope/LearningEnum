package learningJava;

public class ReverseString {

	public static void main(String[] args) {
		String input="Home";

		for (int i=input.length()-1;i>=0;i--) 
		{

			System.out.print(input.charAt(i));

		}
		System.out.println();
	}


}