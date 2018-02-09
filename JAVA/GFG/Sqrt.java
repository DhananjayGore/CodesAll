

public class Sqrt {

  /*Returns the square root of n. Note that the function */
static float squareRoot(float n)
{
  /*We are using n itself as initial approximation
   This can definitely be improved */
  float x = n;
  float y = 1;
  float e =(float) 0.000001; /* e decides the accuracy level*/
  while(x - y > e)
  {
    x = (x + y)/2;
    y = n/x;
  }
  return x;
}

  public static void main(String[] args) {
    float x=(float)49.00;
    System.out.println(squareRoot(x));
    
  }
}