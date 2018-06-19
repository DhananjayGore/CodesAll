/*struct name {
	type variable;
	type variable;
	}v,x,y;
	struct name x= { 
	value,
	value,
	value,
	  };
x=y;valid
x.name=y.name;not valid
use strcpy
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
struct student rinku=
{
 "rinku",
15,
123
 };
ranu=rinku;
printf("%s\n%s",rinku.name,ranu.name);
}