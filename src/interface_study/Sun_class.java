package interface_study;

public class Sun_class implements Fathar_class,Mother_class{

	public static void main(String[] args) {
	 Sun_class hr = new Sun_class();
	 hr.care();
	 hr.wellnees1();
	 hr.love();
	 hr.nature();
	 hr.money();
	 Fathar_class.bike();
	 Mother_class.sari();
		
	}

	@Override
	public void care() {
		System.out.println("this mother care form mother class");		
	}

	@Override
	public void wellnees1() {
		System.out.println("this is weellnees is the mother class");
	}

	@Override
	public void love() {
		System.out.println("this love is fathar class");
		
	}

	@Override
	public void nature() {
		System.out.println("this nature is from father class ");
		
	}

	@Override
	public void money() {
		Fathar_class.super.money();
		Mother_class.super.money();
		
	}

}
