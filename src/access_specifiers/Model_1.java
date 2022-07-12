package access_specifiers;

public class Model_1 {

	public static void main(String[] args) {
		
		first();
		second();
		third();
		forth();
		
	}

	
	private static void first() {
		System.out.println("this is protected satic method ");
	}

	static void second() {
		System.out.println("this is default  satic method ");
	}
	
   protected static void  third() {
		System.out.println("this is protected satic method ");
	}
	
	public static void forth() {
		System.out.println("this is public satic method ");
	}
}
