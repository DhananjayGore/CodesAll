 int factorial ( int n)
{
if (n==0)
return 1;
else
return ( n * factorial (n -1 ));
 }
#include<stdio.h>
#include<conio.h>
main()
{
printf("%d", (factorial(5)));
}