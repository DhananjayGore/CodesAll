import java.util.*;
import java.lang.*;
import java.io.*;
class CountChars2 
 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		// sc.nextLine();
		while(t-->=0){

			String s=sc.next();

			int l=s.length(),i=0,count=0,n=0;
			n=sc.nextInt();
			if (l>=1 && l<=10000) {
				HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
				char prevC='\0';
				for (i=0;i<l;i++) {
					char currC=s.charAt(i);
					if (hm.containsKey(currC) && prevC!=currC ) {
						hm.put(currC,hm.get(currC)+1);
					}

					if (!hm.containsKey(currC)) {
						hm.put(currC,1);
					}
					prevC=currC;
				}
				int c=0;
				
				for(Map.Entry<Character,Integer> e:hm.entrySet())
                  {
                  if(e.getValue()==n)
                  {
                  c++;
                  }
              }
              System.out.println(c);
				
			}
		}
	}
}