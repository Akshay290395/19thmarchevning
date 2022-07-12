package methods;

public class Univercitymarks {

	public static void main(String[] args) {
	
		Univercitymarks ma= new Univercitymarks();
		
		ma.student_mark("AKSHAY", 850, 98.99, 'A');
		
		ma.student_mark("ROHIT", 820, 88, 'A');
		
		ma.student_mark("navaa", 750,80,'B');
		
}
     //name,gread,totalmarks,persentage,
	public void student_mark(String studentname,int totalmark,double stu_persentag,char gread)
	
	{   System.out.println("=================================");
		System.out.println("student name is "+ studentname);
		System.out.println("student total mark is " + totalmark);
		System.out.println("student persentage is " + stu_persentag);
		System.out.println("student geting gread is " + gread);
		System.out.println("====================================");
	}
}
