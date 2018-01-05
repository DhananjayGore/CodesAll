import java.util.*;
import java.lang.*;
import java.io.*;

public class KthLargest {
	public static void main (String[] args) {
		//code
                Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int size = sc.nextInt();
		    int[] arr = new int[size];
		    for(int i=0; i<size;i++){
		        arr[i]=sc.nextInt();
		    }
		    int rank = sc.nextInt();
		    Arrays.sort(arr);
		    System.out.println(arr[rank-1]);
		}
	}
}