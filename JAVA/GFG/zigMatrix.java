import java.util.*;

public class zigMatrix {

	static void printZig(int[][] a,int r,int c)
	{int i,j,k;
		//r=r-1;
		//c=c-1;
		for (i=0;i < r+c-1;i++) {
			//for (j=0;j<i;j++) {
			if (i<r-1) {
				for (k=i,j=0;k >= 0 && j<=i ;k--,j++) {
					System.out.print(a[k][j]+" ");
				}
			}
			else
			{
				for (k=r-1,j=i-c;j<c;k--,j++) {
					System.out.print(a[k][j]+" ");
				}
			}	
				System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a=
		 {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16},
                       {17, 18, 19, 20},
                      };
		// {
		// 	{1,2,3},
		// 	{4,5,6},
		// 	{7,8,9},
		// 	{0,11,12},
		// };

		int r=5;
		int c=4;

		printZig(a,r,c);
	}
	
}