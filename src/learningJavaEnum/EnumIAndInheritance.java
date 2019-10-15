package learningJavaEnum;

enum TrafficColor {
	RED, YELLOW, GREEN;
}

public class EnumIAndInheritance {

	public static void main(String[] args) {
		
		// Demo of values() method

		TrafficColor[] enumElementName = TrafficColor.values();

		for (TrafficColor color : enumElementName) {

			System.out.println(color);
		}

		// Demo of ordinal() method, each enum constant index can be found, just like
		// array index.

		TrafficColor[] enumElementIndex = TrafficColor.values();
		for (TrafficColor colorIndex : enumElementIndex) {

			System.out.println(colorIndex.ordinal());
		}
		
		//Demo of valueOf() method returns the enum constant of the specified string value, if exists.
		
		 System.out.println(TrafficColor.valueOf("RED")); 

	}

}
