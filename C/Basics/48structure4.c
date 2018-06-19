/*passing structure and structure elements to a fn */
struct student { 
char name[15];
int roll;
};
#include<stdio.h>
#include<conio.h>
main()
{
struct student rinku=
{
 "rinku",
123,
 };
 display (rinku.name,rinku.roll );
show(rinku );
}
void display (char n[], int r)
{
printf("display fn\n %s\t%d\n",n,r);
}

void show (struct student s )
{ 
printf("show fn\n %s\t %d",s.name,s.roll);
}
