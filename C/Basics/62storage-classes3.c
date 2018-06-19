//static type variable-name;
//persist b/w fn calls
//scope is local to block
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void inc()
 {{
static int x;
printf("inside  %d ",x++);
//Will print default value 0;
}
//uncomment bellow
//printf("outside  %d ",x);
//Will give error because of scope
}

main()
{
inc(); 
inc(); 
inc(); 
}

