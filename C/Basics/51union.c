/*union is like structure but we can only use one type at a time; */
#include<stdio.h>
#include<conio.h>
main()
{ 
union data
{ int x;
char c;
 }ramu;
/* printf("%d\n ",sizeof(ramu) );*/
// int x=1;
 char c='a';
  int x=1;
 printf("%d\n ",ramu.x );
 printf("%c\n ",ramu.c );
}