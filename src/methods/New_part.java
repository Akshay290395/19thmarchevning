package methods;

public class New_part {

	
	
	public static void main(String[] args) {
		
		    //  TO CALL NON STATIC MENTHOD FOR SAME CLASS
	        New_part obj = new New_part();
			obj.display();
	
			// TO CALL NON-SATATIC METHOD FOR ANY OTHER CLASS
			Non_static_method ARJ = new Non_static_method();
			ARJ.paint();
			
			//TOO CALL NON-STATIC METHOD FROM ANY OTHER CLASS 
			Non_static_method RSG = new Non_static_method();
			RSG.paint();
			
	
	}

	public void display() {
		System.out.println("hii it is new one");
	}
}
