
#include<stdio.h>
#include<conio.h>
main()
{
int a=5,b =7;
printf("initially a is %d n b is %d\n",a,b);
a=a*b;
b=a/b;
a=a/b;
printf("after swap  a is %d n b is %d\n",a,b);
}