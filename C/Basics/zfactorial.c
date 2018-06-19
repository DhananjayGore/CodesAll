#include<stdio.h>
#include<conio.h>
main()
{
int factorial(int a)
  { if (a==0)
  factorial(a)=1;
 else
 factorial(a)= (a * factorial(a  -1));
}
factorial(5);
}