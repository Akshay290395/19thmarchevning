package inharitance;

public class Father_main {

	public static void main(String[] args) {
		
		
		Fathar_hierarchical obj = new Fathar_hierarchical();
		obj.softnees();
		Fathar_hierarchical.imotion();
		System.out.println("***************************************");
		
		Sun csk = new Sun();
		csk.moblie();
		Sun_inharitance.bike();
		
	    ///csk.softnees();----------->pending
		Sun_inharitance.imotion();
		
		System.out.println("***************************************");
		
		Daughter obj3=new Daughter();
		obj3.makeup();
		Daughter.money_bank();
		System.out.println("***************************************");
		
		obj3.softnees();
		Daughter.imotion();
		
	}

}
