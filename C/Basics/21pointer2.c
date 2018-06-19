//pointer to pointer
#include<stdio.h>

int main()
{
int x=10;
int *p;/* "*" "&" are complementary*/
p= &x;
int **q;
q= &p;

printf("%d is x\n",x );
printf("%u is p\n",p);
printf("*p is %u\n",*p);
printf("%d is *(&x)\n",*(&x));
printf("q is %u\n ",q);
printf("%u  is *q\n",*q );
printf("%u is  **q\n",**q);
return 0;
}