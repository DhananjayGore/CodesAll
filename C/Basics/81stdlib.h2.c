/*
div_t div(int numerator,int denominator);
div_t is a structure with variable quot n rem;
*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{div_t  n;
int a=10,b=3;
n=div(a,b);
printf("%d is the quotient n %d is remainder of %d / %d",n.quot,n.rem,a,b);}