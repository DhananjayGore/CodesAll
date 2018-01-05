import java.util.*;
import java.lang.*;
import java.io.*;

public class FindNameInMatrix{

	static void find(String s,char[][] mat,int r,int c){
		char[] ca=s.toCharArray();
		char ch=ca[0];
		for (int a=0;a<r;a++) {
        	for (int b=0;b<c;b++) {
        		if (mat[a][b]==ch) {
        			boolean x=false;
        			x=findAll(ca,mat,r,c,a,b);
        			if (x==true) {
        				break;
        			}
        		}
        	}
       	}
	}

	static boolean findAll(char[] ca,char[][] mat,int r,int c,int a,int b){
		int l=ca.length;
		System.out.println(a+" "+b);
		boolean flag=false;
		
		int i=0;
		//right
				if (b+l-1<c) {
					System.out.println("case right");
					for (i=0;i<l;i++) {
						if (ca[i]!=mat[a][b+i]) {
							break;
						}
					}
					System.out.println(i+"right");
					if (i==l) {
						flag=true;
					}
				}
				
				//left
				if (b-l+1>=0) {
					System.out.println("case left");
					for (i=0;i<l;i++) {
						if (ca[i]!=mat[a][b-i]) {
							break;
						}
					}
					System.out.println(i+"left");
					if (i==l) {
						flag=true;
					}
				}



		if (a-l+1>=0 && flag==false) {
			System.out.println("case 1");
			//verticle up
			for (i=0;i<l;i++) {
				if (ca[i]!=mat[a-i][b]) {
					break;
				}
			}
			System.out.println(i+"up");
			if (i==l) {
				flag=true;
			}

			//up left
			if (b-l+1>=0){
				for (i=0;i<l;i++) {
					if (ca[i]!=mat[a-i][b-i]) {
						break;
					}
				}
				System.out.println(i+"up left");
				if (i==l) {
					flag=true;
				}
			}

			//up right
			if (b+l-1<c){
				for (i=0;i<l;i++) {
					if (ca[i]!=mat[a-i][b+i]) {
						break;
					}
				}
				System.out.println(i+"up right");
				if (i==l) {
					flag=true;
				}
			}

			
		}

		if (a+l-1<r && flag==false){
			System.out.println("case  2");
			//down
				for (i=0;i<l;i++) {
					if (ca[i]!=mat[a+i][b]) {
						break;
					}
			}
			System.out.println(i+"down");
				if (i==l) {
					flag=true;
				}

			//down left
			if (b-l+1>=0){
				for (i=0;i<l;i++) {
					if (ca[i]!=mat[a+i][b-i]) {
						break;
					}
			}
			}
			System.out.println(i+"down left");
				if (i==l) {
					flag=true;
				}

			//down right
			if (b+l-1<c){
				for (i=0;i<l;i++) {
					if (ca[i]!=mat[a+i][b+i]) {
						break;
					}
			}
			System.out.println(i+"down right");
				if (i==l) {
					flag=true;
				}
			}	
		}
		if (flag==true) {
			System.out.println(a+" "+b);
			return true;
		}
		return flag;
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=0;
        t=sc.nextInt();

        for (int i=0;i<t;i++) {
        	int r=0,c=0;
        	r=sc.nextInt();
        	c=sc.nextInt();
        	char[][] mat=new char[r][c];
        	for (int a=0;a<r;a++) {
        		for (int b=0;b<c;b++) {
        			mat[a][b]=sc.next().charAt(0);
        		}
        	}
        	sc.nextLine();
            String s;
            s=sc.next();
            find(s,mat,r,c);
        }
	}
	
}