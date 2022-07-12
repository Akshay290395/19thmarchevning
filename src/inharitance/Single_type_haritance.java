package inharitance;

public class Single_type_haritance {

	public static void main(String[] args) {
		// to creat  non-static method
		
		Mothor obj=new Mothor();//obj for mother class
		obj.nature();
		Mothor.care();//mothor propertiy
		
		Child tr=new Child();//obj for child class
	     tr.mobile();
	     Child.laptop();//child propertiy
	     
	     
		tr.nature();
		Child.care();
		
	}

}
