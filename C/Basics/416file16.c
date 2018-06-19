/* fn can create a temp file name*/
#include<stdio.h>
#include<conio.h>
main()
{
char name[100 ]; //="mahi";
tmpnam(name);
puts(name);
}