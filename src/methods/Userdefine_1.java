package methods;

public class Userdefine_1 {

	
	public Userdefine_1() {
		String abj="india";
		int a= 450;
		int b=250;
		char gread = 'A';
		
		System.out.println("NAME OF CUNTRA IS " + abj );
		
	}
	public Userdefine_1(String name , int a ,int b) // WE HAVE TO GIVE THE PRINT STATMENT IN METHOD ONLY.
	{   System.out.println("==========================");
		System.out.println("NAME OF CUNTRA IS " + name );
		System.out.println("NAME OF CUNTRA In " + a );
		System.out.println("NAME OF CUNTRA IS " + b );
		System.out.println("==========================");
	}
	public static void main(String[] args) {
		Userdefine_1 mi = new Userdefine_1();
		Userdefine_1 cs = new Userdefine_1("india" , 150, 250);
		
		Userdefine_1 cs1 = new Userdefine_1("USA" , 250, 1590);
		
		Userdefine_1 cs2 = new Userdefine_1("UK" , 165410, 45580);

	}

	
	
}
