package constructor;

public class User_define_contrcter {

	
	public User_define_contrcter() //user define contrcter
	{
		System.out.println("this is user difine contrcter");
	}
	
	public static void main(String[] args) {
	
		User_define_contrcter obj = new User_define_contrcter();
		obj.test();
		
		}
    public void test()
    // to creating one non-static method  
    {
    	System.out.println("my name is akshay and im from satara");
    }
	
	
	
	
}
