/* void realloc(current-pointer,New-size);
*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{ char *pointer;
pointer=(char *) malloc (13);
if (pointer ==NULL)
puts("failed in allocating");
else
{
 puts("allocated successfully");
strcpy (pointer,"mahi d great");
}
pointer=(char *) realloc (pointer,19);
strcat (pointer," rockz");
puts (pointer);
free (pointer);
}