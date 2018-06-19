/*in a mode content will not be lost*/
#include<stdio.h>

int main()
{FILE  *fpointer;

fpointer = fopen("array.c","a");

if (fpointer == NULL)
printf("error");
else
printf("success");
	fclose(fpointer);
	return 0;
}