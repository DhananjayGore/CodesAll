/*fprintf(fpointer,"format", variable*/
#include<stdio.h>
int main()
{
	int age;
	char name[25 ];
	FILE  *fpointer;

fpointer = fopen("mahi.txt","a");

printf("enter ur name n age\n");
scanf ("%s %d",name,&age);
if (fpointer == NULL)
	printf("error");
else
	{
	fprintf(fpointer,"%s %d",name,age);
	}
	printf("written to file\n");
	
fclose(fpointer);
return 0;
}