/*  int atexit(void (* fn) (void);
calls fn b4 termination
void exit(int exit_code);
exit normally with open files flushed
void _Exit(int exit_code);
no flush
*/
void onexit( )
{ 
puts("I m called b4 termination");
getch( );
}

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>


main()
{
int j=1;
if ((atexit(onexit())) != 0)
printf("failed to register onexit fn as termination fn");

while (1)
 { 
 printf("%d\n",j);
  if (j==10)
 { exit(0); }
 j++;
 }
   
 
   }
