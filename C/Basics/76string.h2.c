/*
int memcmp(str1,str2,length);
gives null if both r equal
*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{ int length,l1,l2,result;
char data1[ ]="mahi rocks";
char data2[ ]="mahi";
l1=strlen(data1);
l2=strlen(data2);
length= (l1>=l2 )? l2 : l1;

result =memcmp (data1,data2,length);
if (result==NULL)
printf("first %d character of both strings r equal\n ",length);
 else
 printf("first %d character of both strings r not equal\n ",length);
    }