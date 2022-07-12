package generalization_study;

public class Generalization_for_bank {

	public static void main(String[] args) {
		
		SBI pk= new SBI();
	    pk.customer();
	    pk.saveing();
	    pk.system();
	    pk.trim();
	    
	    System.out.println("********************");
	    
		IDBI RO = new IDBI();
		RO.saveing();
		RO.customer();
		RO.system();
		RO.staf();
		
		System.out.println("********************");
		
		
		
		
		
		
		
		
	}

}
