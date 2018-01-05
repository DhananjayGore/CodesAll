import java.util.*;

public class CountChars{

static void counter(String s,int n){
	char[] ca=s.toCharArray();
	Arrays.sort(ca);
	int count=0,result=0;
	char prevC=ca[0];char currC=ca[0];
	// System.out.print(ca);
	int i;
	for (i=0;i < ca.length;i++) {
		if(ca[i]==currC){
			count++;
		}
		else{
			if (count==n) {
				// System.out.print(currC+" ");
				result++;
			}
			
			currC=ca[i];
			count=1;
		}
	}
	if (i==ca.length && count==n) {
		// System.out.print(currC+" ");
		result++;
	}
	System.out.print(result);

}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t-->=0){
			String s=sc.nextLine();
			if (s.length()<=10000 && s.length()>=1) {
				int n=sc.nextInt();
				counter(s,n);
			}
	}
		}
}