package access_specifiers;

public class Access_modifier {

	public static void main(String[] args) {
	
		
		Access_modifier obj= new Access_modifier();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		
		
	}

         private void test1 ()
           {
	 System.out.println("this is from protected mehtod");
           }
      void test2() {
		System.out.println("this is from defoult mehtod");
		
	}
	   protected void  test3() {
		System.out.println("this is from proteted  mehtod");
		
	}
     	public void test4() {
		System.out.println("this is from public mehtod");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}






















