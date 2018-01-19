import java.util.*;
import java.lang.*;
import java.io.*;

public class TowerOfHanoi{
	static void toh(int n,char S,char T,char D){
		if (n==1) {
			System.out.println("Move disk 1 from "+S+" to "+D);
		}
		else {
			toh(n-1,S,D,T);
			System.out.println("Move disk "+n+" from "+S+" to "+D);
			toh(n-1,T,S,D);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		toh(n,'A','B','C');
	}
	
}