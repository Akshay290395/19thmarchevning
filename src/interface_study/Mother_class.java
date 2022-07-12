package interface_study;

public interface Mother_class {
    void care();
    
    void wellnees1();
    
    default void money() {
    	System.out.println("this is mother money");
    }
    static void sari() {
    	System.out.println("this is mother sari");
    }
    
}
