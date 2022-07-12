package inharitance;

public class Main_part {

	public static void main(String[] args) {
		
		
		GrandMother obj = new GrandMother();
		obj.receipe();
		GrandMother.stories();
		System.out.println("*****************************");
		
		Mother obj1= new Mother();
		obj1.mother();
		Mother.care();
		obj1.receipe();
		Mother.stories();
		System.out.println("*****************************");
		
		
		Sun obj2 = new Sun ();
		obj2.child();
		Sun.moblie();
		
		
		
		obj2.receipe();
		Sun.stories();
		Sun.care();
		obj2.mother();
		
		
		System.out.println("*****************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
