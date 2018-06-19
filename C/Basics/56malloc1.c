/* void malloc(no.-of-bytes);
void free(current-storage-pointer);*/

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{ int *p;
p=(int *)malloc(sizeof(int ) );
if (p==0 )
printf("failed");
else
{ 
*p=30;
	printf("%d",*p);
 }
//similarly with other variable types;

}