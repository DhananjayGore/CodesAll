
import java.util.*;

public class sortAbsDiff{

	static  Integer[] sortAD(Integer[] a,int s,int k)
	{
		Arrays.sort(a,new Comparator<Integer>(){
			public int compare(Integer x,Integer y)
			{
				if (Math.abs(x-k)>Math.abs(y-k)) {
					return 1;
				}
				else {
					return -1;
				}
			}
		});
		return a;
	}

	public static void main(String[] args) {
			int s=5;
		 Integer[] a= {10, 5, 3, 9 ,2};
		 s=a.length;

		 int k=7;

		 a=sortAD(a,s,k);
		 int i;
		 for (i=0;i<s;i++) {
			System.out.print(a[i]+" ");		 	
		 }

	}
	
}