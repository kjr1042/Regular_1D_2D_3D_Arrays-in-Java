import java.util.Scanner;
public class two_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [2][5];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter the values: "+i +" "+j);
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		

	}

}
