/*binary files should be opened with b suffix
eg. "wb"*/
#include<stdio.h>

int main()
{FILE  *fpointer;

fpointer = fopen("array.c","r");

if (fpointer == NULL)
printf("error");
else
printf("success");
	fclose(fpointer);
	return 0;
}