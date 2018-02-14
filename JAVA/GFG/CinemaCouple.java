import java.util.Scanner;
class CinemaCouple{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next().toString();
		char[] cArray = input.toCharArray();
		int swapCount = 0;
		for (int i = 0; i < cArray.length-1 ;i++ ) {
			if (cArray[i] != cArray[i+1]) {
				for (int j = i+2; j < cArray.length ; j++ ) {
					if (cArray[i] == cArray[j]) {
						char t = cArray[i+1];
						cArray[i+1] = cArray[j];
						cArray[j] = t;
						swapCount++;
					}
				}
			}
		}

		System.out.println(cArray);
		System.out.println(swapCount);
	}
}