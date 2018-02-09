
import java.util.*;
public class SubStrCount{

	// static int count(String a, String b, int la, int lb)
 //    {	//both string over or sub string over
 //    	if ((la == 0 && lb == 0) || lb == 0)
 //            return 1;

 //        //main string over
 //        if (la == 0)
 //            return 0;

 //        if (a.charAt(la - 1) == b.charAt(lb - 1))
 //            return count(a, b, la - 1, lb - 1) +
 //                   count(a, b, la - 1, lb);
 //        else
 //            return count(a, b, la - 1, lb);
 //    }
	static int count(String a, String b, int la, int lb)
    {	
    	if ((la==0 && lb==0) || lb==0) {
    		return 1;
    	}
    	if (la==0) {
    		return 0;
    	}
    	String X=a.substring(1,a.length());
    	String Y=b.substring(1,b.length());
    	if (a.charAt(0) == b.charAt(0)) {
    		return count(X,Y,X.length(),Y.length())+
    			   count(X,b,X.length(),b.length());
    	}
    	else {
    		return count(X,b,X.length(),b.length());
    	}
    }

	public static void main(String[] args) {
		String a="geeksforgees";
		String b="gks";
		System.out.println( count(a, b, a.length(), b.length())) ;

	}
}