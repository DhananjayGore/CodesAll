//NOT WORKING
/*
int atoi(const char *str);
converts a number string to integer
only gives integer part..
remove all decimal nu or letters present
*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{//char num1="12";
int n;
//n=atoi (num1);
n=atoi("12.35t");
printf("%d",n);
}
