//pass by value
#include<stdio.h>

void display (int x ,int y )
{ 
printf("x is %d n y is %d ",x,y);
}

int main()
{
	int x=10,y=20;
	display (x,y);
}