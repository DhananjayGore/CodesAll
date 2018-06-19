//NOT WORKING with auto
/* storage classes r
automatic
register
static
external
*/
//AUTOMATIC 
//auto type variablename;
//scope is local to block
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{
 {
//auto int x;
int x;
printf("inside  %d ",x);
//Will print garbage value
}
//uncomment bellow
//printf("outside  %d ",x);
//Will give error because of scope
}