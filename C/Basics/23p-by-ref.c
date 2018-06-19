//pass by references
#include<stdio.h>
void display (int *p ,int *q)
{ 
printf("*p is %d n *q is %d ",*p,*q);
}

int main()
{
	int x=10,y=20;
	int *p,*q;
	 p=&x,q=&y;

display (&x,&y);
return 0;
}