/*
typdef struct or union
{type variable1;
type variable2;
} new-name;
*/
#include<stdio.h>
#include<conio.h>
;main()
{
typedef struct
{ 
int age;
char name[10];
}person;
person var;

var.age= 10;
strcpy (var.name,"mahi");
printf("%d\n%s\n", var.age,var.name);

typedef union
{ 
int age;
char name[10];
} person2;
person2 var2;

var2.age= 10;
strcpy (var2.name,"mahi");
printf("%d\n%s", var2.age,var2.name);
}