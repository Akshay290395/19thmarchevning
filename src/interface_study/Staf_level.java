package interface_study;

public interface Staf_level {

	void akshay();
	
	void navnath();
	
	default void ajay () {
		System.out.println("ajay uis not staf or not assestant maneger");
	}
	
	static void mayur() {
		System.out.println(" mayur is x CR persun");
	}
	
	
}
