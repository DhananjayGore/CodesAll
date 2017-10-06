
public class altBits{
	public static void main(String[] args) 
	{
		 int x=42;//101010

		int num=x^(x>>1);//101010 XOR 10101 =111111

		int z=(num+1)&num;
		System.out.print(z);
	}
	
}