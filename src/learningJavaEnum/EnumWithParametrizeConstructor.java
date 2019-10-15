package learningJavaEnum;

//declaration of enum 
enum tlight {
	RED("STOP"), YELLOW("BE READY"), GREEN("GOOD TO GO");

	// Declaration of private variable to get value
	private String action;

	// Declaration of parameterized Constructor
	private tlight(String action) {
		this.action = action;
	}

	// Declaration of getter method to get value
	public String getAction() {
		return this.action;
	}

}

public class EnumWithParametrizeConstructor {

	public static void main(String[] args) {
		
		tlight[] lColor= tlight.values();
		for (tlight tlcolor : lColor) {
			 System.out.println(tlcolor.name() +"-> " +tlcolor.getAction());
		}
		
	}

}
