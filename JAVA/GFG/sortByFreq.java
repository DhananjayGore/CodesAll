import java.util.*;

public class sortByFreq 
{
	public static void main(String[] args) {
		//ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			int x=sc.nextInt();
			//a.add(x);
			if (hm.containsKey(x))
			{
			int freq=hm.get(x);
			hm.put(x,freq+1);	
			}
			else
			{
				hm.put(x,1);
				b.add(x);
			}
		}

		
		Collections.sort(b,new Comparator<Integer>()
		{
			@Override
			public int compare(Integer x,Integer y)
			{
				if (hm.get(x) > hm.get(y)){
				return -1;	
				}
				else{
				return 1;
				}
			}
		});

		int hmz=hm.size();
		int x=0;
		while(1==1)
		{
			if (x<hmz) 
			{
			int s=hm.get(b.get(x));
			for (int aa=0;aa<s;aa++) 
			{
			System.out.print(b.get(x)+" ");	
			}
			x++;	
			}
			else
			{
				return;
			}	
		}
	}
}