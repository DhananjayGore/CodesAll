/* tmpfile( );
creates a temp file n returns its fpointer,
it gets deleted on completion of program; */
#include<stdio.h>
#include<conio.h>
main()
{ 
FILE *temp;
char data[ ]="mahi way";
int j=-1,l=strlen(data);
temp = tmpfile( );
if (temp != 0 )
printf("temp file created successfully");
 else
 printf("temp file creation failed!!\n ");
 
 while (++j<l) 
 {
 fputc(data[j],temp);
  }
rewind(temp );
while (feof(temp)!=0) 
{ 
putchar (fgetc(temp) );
 }
}
/*#include<stdio.h>
#include<conio.h>
main()
{ printf("%p",tmpfile());
}*/