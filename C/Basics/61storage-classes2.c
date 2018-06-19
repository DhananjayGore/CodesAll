//register type variable-name;
//scope is local to block
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{
 {
register int x;
printf("inside  %d ",x);
//Will print garbage value
}
//uncomment bellow
//printf("outside  %d ",x);
//Will give error because of scope
}