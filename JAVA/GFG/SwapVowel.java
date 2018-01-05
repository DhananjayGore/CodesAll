import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    
    static void rev(String s)
{
    char[] ca=s.toCharArray();
    int l=ca.length;
    int i=0,j=l-1;
    while(i<j)
    {
        // System.out.println("here");
        if(isVowel(ca[i]) && isVowel(ca[j]))
        {
            char temp=ca[i];
            ca[i]=ca[j];
            ca[j]=temp;
            i++;j--;
        }
        if(!isVowel(ca[i]))
        {
            i++;
        }
        if(!isVowel(ca[j]))
        {
            j--;
        }
    }
    System.out.println(ca);
    // System.out.println(Arrays.toString(ca));
}

static boolean isVowel(char c)
{
    // ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='I'
    if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'  ){
        return true;
    }
    else{
        return false;
    }
}

    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=0;
        t=sc.nextInt();

        for (int i=0;i<t;i++) {
            String s;
            s=sc.next();
            rev(s);
        }
    }
}