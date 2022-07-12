package interface_study;

public class Staf_mixing implements Staf_level,Assestant_maneger {
 int s=25;
    
	public static void main(String[] args) {
		
	 Staf_mixing ok = new Staf_mixing();
	 ok.vishal();
	 ok.mangesh();
	 ok.akshay();
	 ok.navnath();
	 ok.ajay();
	 
	 Staf_level.mayur();
	 Assestant_maneger.nihar();
	 //System.out.println("valeu of goble variable s is " + this.s);
      Staf_mixing s1=new Staf_mixing();
      System.out.println("valeu of goble variable s is " + s1.s);
	}
		@Override
	public void vishal() {
		System.out.println(" vishal is the assestant maneger");
		
	}

	@Override
	public void mangesh() {
		System.out.println("mangesh is the assestant maneger");	
	}

	@Override
	public void akshay() {
		System.out.println("akshay is the staf ");		
	}

	@Override
	public void navnath() {
		System.out.println("navnath is the staf ");
		
	}

	@Override
	public void ajay() {
		
		Staf_level.super.ajay();
		Assestant_maneger.super.ajay();
				
	}
	

}
