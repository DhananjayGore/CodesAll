/* allocating dynamic memory on basis of user input*/

/*gets puts free  not working*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{ char *p;
int length;
printf("enter length of string u gonna enter\n");
scanf("%d",&length );
p=(char *) malloc (sizeof ( char )*length+1);
//+1 is for NULL
printf("%p\n",p);
if (p==0 )
puts("failed");
else 
{ 
fflush (stdin);
//flush used space;
printf("enter your string\n ");
gets(p);
puts (p);
//free(current storage pointer);
//frees memory at pointer address;
free (p );
 }
 printf("%p\n",p);
}