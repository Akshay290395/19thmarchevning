package array;

public class Array_class {

	public static void main(String[] args) {
		//ram,sheta,laxman
		
		//decleration array
		String name[]=new String[4];
		
		name [0]="ram";
		name [1]="seeta";
		name [2]="laxman";
		name[3]="raven";
		
		//array initalation
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println("************ this is static array for loop ***********");
		
		
		for (int i=0; i<=2; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("************this is static reverse for loop*************");
		
		for (int i=2; i>=0;i--) 
		{
			System.out.println(name[i]);
		}
		System.out.println("***********this is dynamic array for loop **************");
		
		for(int i=0; i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		System.out.println("***********this is dynamic array for loop **************");
		
		for (int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		

}
