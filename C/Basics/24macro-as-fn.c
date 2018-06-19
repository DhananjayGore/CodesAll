/*escape sequence is used to escape the meaning of new line as macro can only be written in single line*/

#include<stdio.h>



int main()
{	
	#define CHECK(j) if(j<10)\
{printf("less than 10\n");\
}else{                                   \
printf("greater than 10");\
}

	CHECK(2);
	CHECK(12);
	return 0;
}