// Distinct Palindromic Substr
import java.util.*;
public class DistinctPalindromicSubstr{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			HashSet<String> hs=new HashSet<>();
			int j=0,i=0;


			for(i=0;i<=s.length();i++) {
				for(j=i;j<=s.length();j++ ) {
					String temp=s.substring(i,j);
					if (isPal(temp)) {
						hs.add(temp);
					}
					
				}
			}

			Iterator<String> it=hs.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

		static boolean isPal(String s){
			char[] ca=s.toCharArray();
			int l=ca.length;
			int i=0,j=l-1;
			while (i<j) {
				if (ca[i]==ca[j]) {
					i++;
					j--;
				}
				else {
					return false;
				}
			}
			return true;

			// if (i==j || i>j) {
			// 	return true;
			// }
			// return false;
		}
}