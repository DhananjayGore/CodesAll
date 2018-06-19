//#define preprocessor
//#define NAME Val 
//no semicolon
//# define NAME Val 

#include<stdio.h>
int main()
{
#define L 10
#define Name "MAHI"
#define p printf
int j;
printf(Name"#\n");
for(j=1;j<L ;j++)
{ 
printf("%d\n",j);
p("%s\n",Name);
}
return 0;
	
}