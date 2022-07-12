package array;

public class multi_array {

	public static void main(String[] args) {
		// ram , laxman ,seeta
		
		String R[][]= new String [2][2] ;
       R[0][0]="RAJESH";
       R[0][1]="AKSHAY";
       R[1][0]="RAJESH";
       R[1][1]="MASHUK";
       
       System.out.println("****for loop *****");
       
    for (int i=0;i<=R.length-1;i++)
    {
    	for(int j=0; j<=R.length-1;j++)
    	{
    		System.out.print(R[i][j]+" ");
    	}
    	System.out.println();
    }
       System.out.println("***reverse loop****");
       for (int i =R.length-1;i>=0;i--)
       {
    	   for (int j=R.length-1;i>=0;i--)
    	   {System.out.println(R[i][j]+" ");
       }
       
       
	}
	}
}
