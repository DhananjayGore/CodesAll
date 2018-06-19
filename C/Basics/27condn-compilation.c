
/*used to compile piece of code based on given condn*/
//should end with #endif
#include<stdio.h>

#define MARKS 44
int main()
{

#if (MARKS >75)   
printf("A grade");

#elif MARKS > 50
printf("B Grade");
#else MARKS<50
printf("C Grade");
#endif
return 0;
}