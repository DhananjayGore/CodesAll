import java.util.*;
import java.lang.*;
import java.io.*;

public class plateformNeed {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();

		while(t-->0)
    {
		    int n=sc.nextInt();

		    int[] arr=new int[n];
		    int[] dep=new int[n];

		    for(int i=0;i<n;i++)
        {
		        arr[i]=sc.nextInt();
		    }

		    for(int i=0;i<n;i++)
        {
		        dep[i]=sc.nextInt();
		    }

		    Arrays.sort(arr);
        Arrays.sort(dep);

            int plat_needed = 1, max = 1;
            int i = 1, j = 0;

            while (i < n && j < n)
            {
              if (arr[i] < dep[j])
              {
                  plat_needed++;
                  i++;
                  if (plat_needed > max)
                      max = plat_needed;
              }
              else
              {
                  plat_needed--;
                  j++;
              }
            }
            
		    System.out.println(max);
		}
	}
}