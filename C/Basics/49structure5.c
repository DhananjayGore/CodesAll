/*pointer to structure
struct tag-name *pointer-name;
pointer-name=&struct-variable;
pointer->sub-variable =struct-variable.sub-variable;*/

struct student { 
char name[15];
int roll;
};
#include<stdio.h>
#include<conio.h>
main()
{struct student *ptr;
struct student rinku=
{
 "rinku",
123,
 }; 
 ptr=&rinku;
 printf("normally\n%s  %d\n",rinku.name,rinku.roll );
  printf("with ptr \n%s  %d",ptr->name,ptr->roll );
  
   }