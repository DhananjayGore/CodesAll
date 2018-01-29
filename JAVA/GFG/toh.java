import java.util.*;

public class toh
{

// 	START
// Procedure Hanoi(disk, source, dest, aux)

//    IF disk == 1, THEN
//       move disk from source to dest             
//    ELSE
//       Hanoi(disk - 1, source, aux, dest)     // Step 1
//       move disk from source to dest          // Step 2
//       Hanoi(disk - 1, aux, dest, source)     // Step 3
//    END IF
   
// END Procedure
// STOP
	static void tohGen(int n,int start,int dest,int temp)
	{
		if (n==1) 
		{
		System.out.println("move disk from tower "+start+" to tower "+dest+" ");
		return;	
		}
		else
		{
			tohGen(n-1,start,temp,dest);
			System.out.println("move disk from tower "+start+" to tower "+dest+" ");
			tohGen(n-1,temp,dest,start);
		return;
		}

	}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int start=1,dest=3,temp=2;

		tohGen(n,start,dest,temp);
	}	
}