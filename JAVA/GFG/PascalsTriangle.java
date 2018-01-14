import java.util.*;
import java.io.*;
import java.lang.*;

public class PascalsTriangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		for (int line = 1; line <= n; line++)
		  {
		    int C = 1;
		    for (int i = 1; i <= line; i++)  
		    {
		      System.out.print(C+" ");
		      C = C * (line - i) / i;  
		    }
		    System.out.println();
		  }
	}
}