/*
char * asctime (const struct tm *ptr);
o/p d m date h:m:s yr\n\0 
char *ctime (const time_t *time);
o/p d m date h:m:s yr\n\0 
 
  */
#include<stdio.h>
#include<conio.h>
#include<time.h>
main()
{ time_t t;
t=time(NULL );
printf("by ctime fn\n ");
puts(ctime(&t));
printf("by asctime fn\n ");
puts (asctime(localtime(&t)));
//local time gives str tm;
printf("by asctime fn\n ");
puts (asctime(gmtime(&t)));
}