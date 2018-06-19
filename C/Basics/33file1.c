/* r w a(read write n append mode)
llly r+ w+ a+ opens file with other rest features.
writing a pre created file deletes its content.
in place of file name address can also be passed
files r made available on desktop*/

#include<stdio.h>

int main()
{
FILE  *fpointer;

fpointer = fopen("mahi.txt","w");

if (fpointer == NULL)
printf("error");
else
printf("success");

fclose(fpointer);
return 0;
}