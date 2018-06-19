
#include<stdio.h>
#include<conio.h>
main()
{
int a=5,b =7, temp;
printf("initially a is %d n b is %d\n",a,b);
temp=a;
a=b;
b=temp;
printf("after swap  a is %d n b is %d\n",a,b);
}