package interface_study;

public interface Assestant_maneger {
	
	void vishal();
	
	void mangesh();

	 default void ajay () {
		System.out.println("ajay uis not staf or not assestant maneger he is planer");
	}
	 static void nihar() {
		 System.out.println("nihar is work in m/c shop ");
	 }

}
