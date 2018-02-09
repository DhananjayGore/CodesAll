public class Palindrome {
	public static void main(String[] args) {
		int x=1212;
		String s=Integer.toString(x);
		int l=s.length();

		int i=0,j=l-1;
		while(i<j){
			if (s.charAt(i)==s.charAt(j)) {
				i++;j--;
			}
			else
			{
				System.out.println("No");
				break;
			}
		}

		if (i==j || i>j) {
			System.out.println("Yes");
		}
	}
	
}