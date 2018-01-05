import java.util.*;

public class AllPerms{

static void permute(char[] s,int l,int r){
	if (l==r) {
		
		 System.out.println(s);
	}
	else{
		for (int i=l;i<=r;i++) {
			s=swap(s,l,i);
			permute(s,l+1,r);
			s=swap(s,l,i);
		}
		
	}
}

static char[] swap(char[] s,int i,int j){
	char temp=s[i];
		s[i]=s[j];
		s[j]=temp;

return s;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		int l=s1.length;

		permute(s1,0,l-1);		
	}
}