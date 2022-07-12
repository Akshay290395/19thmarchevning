package interface_study;

public interface Fathar_class {
	
	void love ();
	
	void nature();
	
	default void money() {
		System.out.println("money of father ");
	}
	static void bike() {
		System.out.println("this is father bike");
	}
}
