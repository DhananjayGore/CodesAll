import java.util.*;
public class largestNumCreate2 
{

public static void main(String[] args) {
	String[] a = {"54","546","548","60"};

	int l=a.length;

	Arrays.sort(a,new Comparator<String>()
	{
		@Override
		public int compare(String x,String y)
		{
			String xy=x+y;
			String yx=y+x;

			return xy.compareTo(yx) > 0? -1 : 1;
		}
	});


	for(String s:a)
	{
		System.out.print(s);
	}


	}
}
	
