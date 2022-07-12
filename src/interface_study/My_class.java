package interface_study;

public class My_class implements Interface_type{

	public static void main(String[] args) {
				
		My_class m= new  My_class();
		m.test();
		m.test1();
		m.test2();
		System.out.println("the val. of a is "  + a);

	}

	@Override
	public void test() {
		System.out.println("this only test method ");		
	}

	@Override
	public void test1() {
		System.out.println("this is only test 1 method ");		
	}
	public void test2() {
		System.out.println("this my method in this class");
		
	}
	

}
