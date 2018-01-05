import java.util.*;

class enhanceFor {
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,0};
		for (int i:a) {
			System.out.println(i);
			
		}

		String array[] = {"Ron", "Harry", "Hermoine"};
 
        //enhanced for loop
        for (String x:array)
        {
            System.out.println(x);
        }
	}
}