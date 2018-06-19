/*lecture 44 fscanf(fpointer,format,variable)
stops at blank space
can read if format(blankspace/tab)format is used
*/
#include<stdio.h>

int main()
{
char c[10],d[10];
int k;
FILE  *fpointer;
fpointer = fopen("mahi.txt","w");

if (fpointer == NULL)
printf("error");
else
{
fscanf(fpointer,"%s %d",c,&k);
}
printf("%s %d now",c,k);
return 0;
}