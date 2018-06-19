//external type variable-name;
//persist b/w fn calls
//scope is global 
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
extern int x;//declaration should be outside all blocks;
main() 
 {
 	//extern int x;
 printf("%d", x);       
   }
  int x=10;