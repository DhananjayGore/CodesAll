
#include<stdio.h>
#include<conio.h>
union data
{
int x;
char c[10 ];
}ramu;

void display(union data *d)
{
printf("%s\n ",d->c);
  
   }
main()
{ union data val;
strcpy (val.c  ,"zandu");
display (&val);
}