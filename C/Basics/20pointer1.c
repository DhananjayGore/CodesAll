#include<stdio.h>

int main()
{

int x=10;
int *p;/* "*" "&" are complementary*/
p= &x;
printf("%d is x\n",x );
printf("%p is p\n",p);
printf("*p is %d\n",*p);
printf("%d is *(&x) ",*(&x));
return 0;	
}