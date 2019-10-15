//Java program to demonstrate that enums can have constructor 
// and concrete methods. 

package learningJavaEnum;
//An enum (Note enum keyword inplace of class keyword)
enum weekends {
	SATURDAY, SUNDAY;

	// enum constructor called separately for each 
    // constant 
	//this method is print for all item present in enum 
	private weekends() {
		System.out.println("Construtor called for"+this.toString());

	}
	
	 // Only concrete (not abstract) methods allowed 
    public void colorInfo() 
    { 
        System.out.println("Universal Color"); 
    } 
} 

  public class EnumWithConstructor {
  
  public static void main(String[] args) {
	  
	
	  weekends choice = weekends.SATURDAY;
	  System.out.println(choice);
	  choice.colorInfo();
  
  }
  
  } 
 