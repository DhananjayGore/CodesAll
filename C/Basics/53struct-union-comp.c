/*for structure size is sum of all variable +k;
while for union its maxof size of variables in its definition*/
#include<stdio.h>
#include<conio.h>
struct student { 
char name[15];
int age;
int roll;
}k;
union stud { 
char name[15];
int age;
int roll;
}r;
main()
{ printf("for structure sizeof gives %d\n ",sizeof(k));
printf("for union sizeof gives %d\n ",sizeof(r));
}