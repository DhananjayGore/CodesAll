//doubt
/* ferror(from pointer);
null if no errors else non zero;*/

#include<stdio.h>
int main()
{ 
	FILE *fp;
	int status;
	char data[ ]="hey baby";

fp=fopen("mahi.txt","a");

if (fp != 0)
	{
	fprintf (fp,"%s",data);

	status = ferror (fp);

	printf("%d\n" ,status);
	}
return 0;
}