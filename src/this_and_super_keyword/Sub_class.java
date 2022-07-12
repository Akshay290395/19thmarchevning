package this_and_super_keyword;

public class Sub_class extends Super_class{
 
	int a=20;  //global variable
	
	
	
	public static void main(String[] args) {
		Sub_class obj = new Sub_class();
		obj.key();
		
	//	Super_class ar =new Super_class();
		//ar.
		Super_class.add();
		
		
	
       
	}

	public void key() {
		int a=65;
		
		System.out.println("local variable of the same class " + a);
		System.out.println("global variabal from same class" + this.a);
		System.out.println("global variable from super class"  + super.a);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}




