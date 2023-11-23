import java.util.Scanner;

public class three_3D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][]=new int [2][3][5];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.println("enter the values: "+i +" "+j +" "+k);
					a[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k] +" ");
					
				}
				System.out.println();
				
			}
			System.out.println();
		}
		System.out.println();

	}

}
