import java.util.*;
class itr1 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
int i=0;
		for (i=0;i<10 ;i++ ) {
		a.add(i);			
		}

		Iterator itr=a.iterator();

		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

		System.out.println();

		itr=a.iterator();

		while(itr.hasNext())
		{
			int x=(Integer)itr.next();
			if ((x%2)==0)
			{
				System.out.print(itr.next()+" ");
			}
			else
			{
				itr.remove();
			}
		}

	}
}