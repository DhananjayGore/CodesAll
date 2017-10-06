import java.util.*;

public class incSeq3
{

static void find(int[] a)
{
	int l=a.length;
	if (l<3) {
		return;
	}

	//int[] b=new int[3];
	int prev,curr,next;
	prev=a[0];
	curr=a[1];
	next=a[2];

	int i=0;

	while(i+2 < l-1)
	{//1 3 2 4
		if (prev<curr)
		{
			if (curr<next) 
			{
			System.out.print(i);	
			break;	
			}
			else
			{
				i++;
				prev=a[i];
				curr=a[i+1];
				next=a[i+2];
			}
		}
		else
		{
			prev=curr;
			curr=next;
			i++;
			next=a[i];
		}

	}
	if (i+2==l-1) {
		System.out.print("soee");	
	}

}

	public static void main(String[] args) {

		int[] a= {-1,-3,4,3,5,6,7,8,9};//{1, 2, 3, 4};//
		//int[] a= {4,3,2,1,0};
		find(a);
		
	}
}
