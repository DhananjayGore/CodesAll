/* sizeof(data type or variable name);
return size it takes in Binary bits;
additional bits in structure is due to structural alignment by compiler;
 */

#include<stdio.h>
#include<conio.h>
struct student { 
char name[15];
int age;
int roll;
}rinku,ranu;
main()
{
 int k;
printf("with data type %d\n",sizeof(int ));
printf("with variable name %d\n",sizeof(k ));
printf("with data type char  %d\n",sizeof(char ));
printf("with data type float  %d\n",sizeof(float ));
printf("with struct data type %d\n",sizeof(rinku ));
}