/* 
char *strerror(int error num);
gives compiler string of error info
*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{
printf(strerror(0));
printf("\n");
printf(strerror(1));
printf("\n");
printf(strerror(2));
printf("\n");
printf(strerror(404));
}