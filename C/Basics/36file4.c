//fputc writing to a file
//fputc(data,fpointer);
#include<stdio.h>

int main()
{
FILE  *fpointer;
char data[25]="mahi way";
int j,len=strlen(data);
fpointer = fopen("mahi.txt","a");
if (fpointer == NULL)
printf("error");
else
printf("writing...\n");

for(j=0 ;j<len;j++)
{
	printf("writing %c \n ",data[j]);
	fputc(data[j],fpointer);
	}
	printf("\ncompleted");
	fclose(fpointer);
}
return 0;
}