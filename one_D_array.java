import java.util.Scanner;
public class one_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[5];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the values :"+i);
			
			a[i]=s.nextInt();
			
		}


		for(int i=0;i<a.length;i++)
		{
			System.out.print( a[i] +" ");
			
		}
		System.out.println();
		
		
		
		
	}

}
