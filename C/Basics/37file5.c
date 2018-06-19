//fputs(name,fpointer);
#include<stdio.h>

int main()
{	char input[30];
	FILE  *fpointer;

fpointer = fopen("mahi.txt","a");

if (fpointer == NULL)
printf("error");
else
{
	printf("enter string to write\n");
	gets(input);
	printf("writing...\n ");
	fputs(input,fpointer);
}

printf("written");
fclose(fpointer);
return 0;
}