//array user input
#include<stdio.h>

int main()
{
int j,s;

printf("enter size of array\n");

scanf ("%d",&s);

int marks[s];
printf("enter %d elements",s);
for (j=0;j<s;j++)
{
	scanf (" %d",&marks[j]);
 }
 
 for (j=0;j<s;j++)
{
	printf ("element at %d is %d\n",j,marks[j]);
 }	
 return 0;
}