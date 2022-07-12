package access_specifiers;

public class For_globale_variable {

	int a=20;
	public static int b=15;
	
	public static void main(String[] args) {
		For_globale_variable obj = new For_globale_variable();
           add();
		  sub();
          mul();
	      div();
	      System.out.println(obj.a);
	      System.out.println(obj.b);
	}
    private static void add() {
    	int r=15;
        int o= 48;
        int sum = r+o;
        System.out.println(sum);
    }
    static void sub () {
    	int u=15;
        int k= 48;
        int sub = u-k;
        System.out.println(sub);
    }
    private static void mul() {
    	int y=15;
        int e= 48;
        int mul = y*e;
        System.out.println(mul);
    }
    private static void div() {
    	int q=15;
        int w= 48;
        int div = q/w;
        System.out.println(div);
    }
}
