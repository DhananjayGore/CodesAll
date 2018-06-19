//fgetc(fpointer);
//feof return true at end of file else false
#include<stdio.h>

int main()
{
char c;
FILE  *fpointer;
fpointer = fopen("mahi.txt","r");

if (fpointer == NULL)
printf("error");
else
{
while ( !feof (fpointer))
{c=fgetc(fpointer);
printf("%c ",c);
 }
}
 fclose(fpointer);
 return 0;
}