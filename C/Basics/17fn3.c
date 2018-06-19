//fn returning value
#include<stdio.h>
#include<conio.h>
main()
{
	 int c;
int add (int a,int b );
c =add (10,20 );	
printf("%d\n",c);
}


int add (int a,int b )
{
int result;
result = a + b;
return result;
 }