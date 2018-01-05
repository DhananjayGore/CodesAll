import java.util.*;

public class minmRadiusForK {

	public static void main(String[] args) {
	int k = 3;
  	int x[] = { 1, -1, 1 };
  	int y[] = { 1, -1, -1};

  	int n=x.length;

  	int a[]=new int[n];

  	for (int i=0;i<n;i++) 
  	{
  	a[i]=(x[i]*x[i])+(y[i]*y[i]);	
  	}

  	System.out.print(a[k-1]);
		
	}
	
}