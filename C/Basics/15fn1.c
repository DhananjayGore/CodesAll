#include<stdio.h>
void display (); //prototyping

int main()
{
/* return_type fn-name(parameters )*/
void display (); //prototyping
/* prototyping can be avoided by writing whole fn b4 its being called*/
display();
return 0;
}


void display( )
{  
printf ("this is printed by a fn" );
}