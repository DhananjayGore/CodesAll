//fn is expected to print d source code
//NOT WORKING
#include<stdio.h>
#include<stdlib.h>
main()
{ FILE  *fp;
char ch;
fp = fopen (_FILE_,"r");
if (fp == NULL )
{
 printf("failed\n");
}
else
{
  do { 
 ch= fgetch(fp);
 putchar (ch);
        }while (ch != EOF);
   }
  fclose (fp);
}