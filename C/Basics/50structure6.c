/*passing structure pointer to a fn */
struct student 
{ 
char name[15];
int roll;
};
void display (struct student *ptr)
{
printf("with ptr \n%s  %d",ptr->name,ptr->roll );
}
#include<stdio.h>
#include<conio.h>
main()
{
struct student *ptr;
struct student rinku=
{
 "rinku",
123,
 }; 
 ptr=&rinku;
 display(ptr);
}