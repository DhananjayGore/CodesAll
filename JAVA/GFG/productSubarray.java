// Java program to find maximum product subarray
import java.io.*;
 
public class productSubarray {
 
    // Utility functions to get minimum of two integers
    static int min (int x, int y) {return x < y? x : y; }
 
    // Utility functions to get maximum of two integers
    static int max (int x, int y) {return x > y? x : y; }
 
    /* Returns the product of max product subarray.
       Assumes that the given array always has a subarray
       with product more than 1 */
    static int maxSubarrayProduct(int arr[])
    {
        int n = arr.length;
        // max positive product ending at the current position
        int maxl = 1;
 
        // min negative product ending at the current position
        int minl = 1;
 
        // Initialize overall max product
        int maxg = 1;
 
        /* Traverse through the array. Following
           values are maintained after the ith iteration:
           maxl is always 1 or some positive product
                           ending with arr[i]
           minl is always 1 or some negative product
                           ending with arr[i] */
        for (int i = 0; i < n; i++)
        {
            /* If this element is positive, update maxl.
                Update minl only if minl is
                negative */
            if (arr[i] > 0)
            {
                maxl = maxl*arr[i];
                minl = min (minl * arr[i], 1);
            }
 
            /* If this element is 0, then the maximum product cannot
               end here, make both maxl and min_ending
              _here 0
               Assumption: Output is alway greater than or equal to 1. */
            else if (arr[i] == 0)
            {
                maxl = 1;
                minl = 1;
            }
 
            /* If element is negative. This is tricky
               maxl can either be 1 or positive.
               minl can either be 1 or negative.
               next minl will always be prev.
               maxl * arr[i]
               next maxl will be 1 if prev
               minl is 1, otherwise
               next maxl will be 
                           prev minl * arr[i] */
            else
            {
                int temp = maxl;
                maxl = max (minl * arr[i], 1);
                minl = temp * arr[i];
            }
 
            // update maxg, if needed
            if (maxg <  maxl)
                maxg  =  maxl;
        }
 
        return maxg;
    }
 
    public static void main (String[] args) {
 
        int arr[] = {1, -2, -3, 0, 7, -8, -2};
        System.out.println("Maximum Sub array product is "+
                            maxSubarrayProduct(arr));
    }
}