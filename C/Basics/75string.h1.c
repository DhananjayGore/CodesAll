/* 
void *memchr (const void *buffer,int ch,size_t  count )
gives the address of first position where ch character occurs in count length of string; 

*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{  char *p ;
char data[ ] ="mahi rocks ";
char search='i';
p= (char *) memchr(data,search,strlen(data));
if (p!=NULL)
puts(p );
//puts prints all d character after the first occurrence of searched letter
else
puts("not found");
 
  }