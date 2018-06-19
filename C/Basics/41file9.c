/*fgets(variable,size,fpointer);
size is length of array used
*/
#include<stdio.h>

int main()
{
char c[ 20],d[20 ];
int k;
FILE  *fpointer;
fpointer = fopen("mahi.txt","r");

	if (fpointer == NULL)
	printf("error");
	else
	{
	while ( !feof (fpointer))
	{
	fgets(c,15,fpointer);
	printf("%s",c);
	}
	}
return 0;
}