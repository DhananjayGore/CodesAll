import java.util.*;

public class rotateArray
{

public static int[] rotate(int a[],int size,int num){
	int[] array2=new int[num];

	int i=0;

	while(i < num)
	{
		array2[i]=a[i];
		i++;
	}

	i=0;
	while(i < (size-num))
	{
		a[i]=a[i+num];
		i++;
	}
	int k=0;

	while(i<size)
	{
		a[i]=array2[k];
		i++;k++;
	}
	return a;
}

public static int[] rotateByOne(int a[],int size){
	int temp=a[0];
	int i=0;
	while(i < (size-1))
	{
		a[i]=a[i+1];
		i++;
	}
	int k=0;

	a[i]=temp;
	return a;
}

public static int[] reverse(int a[],int size)
{
	int start=0,end=size-1,temp;
	while(start < end)
	{
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;

		start++;
		end--;
	}
	return a;
}



public static void main(String[] args) {
	int[] array=new int[5];
	for (int i=0;i<5 ;i++ ) {
		array[i]=i;
	}
	int i=0;
	while(i<5)
	{
		System.out.print(array[i]+" ");
		i++;
	}

	array=rotate(array,5,3);
	System.out.print("\n");
	 i=0;
	while(i<5)
	{
		System.out.print(array[i]+" ");
		i++;
	}
	int[] array3=new int[5];
	System.out.print("\n");
	array3=rotateByOne(array,5);
	i=0;
	while(i<5)
	{
		System.out.print(array3[i]+" ");
		i++;
	}

	array3 = reverse(array,5);
System.out.print("reversed\n");
	i=0;
	while(i<5)
	{
		System.out.print(array3[i]+" ");
		i++;
	}


	
}
}