//array of structure 
#include<stdio.h>
#include<conio.h>
struct student { 
char name[15];
int age;
int roll;
};
main()
{
int j,size=3;
struct student a[size];
for (j=0 ;j<size ;j++) 
{
printf("enter student %d's name age rollno.",j);
scanf("%s %d %d",a[j].name,&a[j ].age,&a[j].roll);
}
for (j=0 ;j<size ;j++) 
{
printf("%s %d %d\n",a[j].name,a[j ].age,a[j].roll);
}
}