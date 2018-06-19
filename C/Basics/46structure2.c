//nested structure
/*rinku.ad1.hn=14;
strcpy(rinku.ad1.sn,"mds");can be used*/
#include<stdio.h>
#include<conio.h>
struct address {  
char sn[15 ];
int hn;
}ad1;
struct student { 
char name[15];
int roll;
struct address ad1;
};

main()
{
struct student rinku=
{
 "rinku",
15,
"mds",
123
 };
 printf("%s\n%d\n%s\n%d",rinku.name,rinku.roll,rinku.ad1.sn,rinku.ad1.hn);
	
}