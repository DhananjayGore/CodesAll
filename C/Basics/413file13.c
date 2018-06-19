//doubt
/* ferror(from pointer);
null if no errors else non zero;
void clearerr(file pointer); */
#include<stdio.h>
int main()
{ FILE *fp;
int status;
char data[ ]="hey baby";
fp=fopen("mahi.txt","r");
if (fp != 0)
{
fprintf (fp,"%s",data);
status = ferror (fp);
printf("%d\n" ,status);
}

if  (status !=0 )
{
	printf("error while writing to file\n");
}
else
{  
printf("success\n");
}

clearerr (fp );

status = ferror (fp);
if  (status ==0 )
{ 
printf("no errors");
 }
 else 
 printf("errors");

return 0;
}