package abtracat;



public class CC extends Abtracal_class{

	public static void main(String[] args) {
		CC obj = new CC();
		obj.test_1();
		obj.add();
		obj.test_2();
		obj.test_3();
		obj.test_4();

	}

	@Override
	public void test_1() {
	 System.out.println("this is akshay");
		
	}

	public void add() {
		System.out.println("this is add method");
	}
	
}
