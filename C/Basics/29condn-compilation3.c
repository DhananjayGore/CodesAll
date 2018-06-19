#include<stdio.h>

#define p 
#undef p
int main()
{
#ifdef p
printf("first");
//#undef p
//#ifdef p
//printf("second");
	#endif
return 0;
}