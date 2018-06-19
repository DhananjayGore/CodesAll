//continue is used to skip loop statement based on condition specified
#include<stdio.h>
int main()
{
	int x=1;
	while (x<10)
	{ if (x==2)
	continue;
	printf("%d\n",x);
	x+=1;
	}
	return 0;
}
	