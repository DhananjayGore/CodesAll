#include<stdio.h>
int main()
{
//type name[size];
int marks[]/*no size needed for set initialisation*/ ={23,34,45,46,49,40 },I;
for (I=0;I<=5;I++)
{
printf("%d\n",marks[I]);
}
return 0;
}