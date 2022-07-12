package constructor;

public class Accunt_of_student {

	public static void main(String[] args) {
	
		Gym_menber obj = new Gym_menber();
		obj.std="akshay";
		obj.hight= 5.9f;
		obj.gread = 'A';
		obj.wegith = 85;
		obj.working_day = 6;
		 obj.std_info();
		System.out.println("/*********************************/");
		
		Gym_menber csk = new Gym_menber();
		csk.std="rohit ";
		csk.hight= 5.7f;
		csk.gread = 'A';
		csk.wegith = 80;
		csk.working_day = 4;
		csk.std_info();
		System.out.println("/*********************************/");
		
	}

}
