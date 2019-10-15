package learningJavaEnum;


	
	enum Day
	{
	 MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY ,SATURDAY, SUNDAY ;	
	}
	
	public class EnumWithSwitch {
		Day day;
		
	public EnumWithSwitch(Day day)
	{
		this.day= day;
	}
	public void isDayLike()
	{
	  switch( day)
	 {
		case MONDAY:
			System.out.println("Starting of the Week with Momday");
			break;
		case SUNDAY:
		case SATURDAY:
			System.out.println("Weekend is awsome");
			break;
		default:
			System.out.println("Any weekday apart for Monday is cool to hang out");
			break;
	 }
	 
	 
	}
	
	public static void main(String[] args) {
	    String dayChoice ="SUNDAY";
		EnumWithSwitch myDay=	new EnumWithSwitch(Day.valueOf(dayChoice));
		myDay.isDayLike();
	}

}
