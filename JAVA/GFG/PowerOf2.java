public class PowerOf2{
	public static void main(String[] args) {
		int x=2;

		if (x>=2) {
				while(x%2==0){
				x/=2;
			}

			if (x==1) {
				System.out.println("Yes");
				
			}
			else {
				System.out.println("No");
			}
		}
		else{
			System.out.println("No");
		}
	}
}