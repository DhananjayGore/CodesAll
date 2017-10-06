import java.util.*;

public class matrix {
	// matrix(int r,int c)
	// {
	// 	int mat=new int[r][c];
	// }

	static int sum(int[][] x,int r,int c)
	{
		int sum=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++ ) {
						sum=sum+x[i][j];
					}		
					
		}
		return sum;
	}
	public static void main(String[] args) {

		//int mat[][] = new int[2][3];
		Scanner sc=new Scanner(System.in);
		// int mat[][]={
		// 			{1,2,3},
		// 			{4,5,6},
		// 			{7,8,9},
		// 			};
		int r=3,c=3;
		// char mat[][]=new char[r][c];
		// for (int i=0;i<3;i++) {
		// 	for (int j=0;j<3;j++ ) {
		// 				// System.out.print(mat[i][j]+" ");
		// 				mat[i][j]=sc.next().charAt(0);

		// 			}		
					
		// }
		// String mat[][]=new String[r][c];
		// for (int i=0;i<3;i++) {
		// 	for (int j=0;j<3;j++ ) {
		// 				mat[i][j]=sc.next();
		// 			}		
					
		// }
		int mat[][]=new int[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++ ) {
						mat[i][j]=sc.nextInt();
					}		
					
		}


		// for (int i=0;i<3;i++) {
		// 	for (int j=0;j<3;j++ ) {
		// 				System.out.print(mat[i][j]+" ");
		// 			}		
		// 			System.out.println();	
		// }
		int sum=sum(mat,3,3);
		// int sum=0;
		// for (int i=0;i<3;i++) {
		// 	for (int j=0;j<3;j++ ) {
		// 				sum=sum+mat[i][j];
		// 			}		
					
		// }
		System.out.println(sum);

	}
	
}