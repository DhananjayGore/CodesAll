/* 
clock();gives clock ticks
CLOCKS_PER_SEC gives no. of clocks per second

*/
#include<stdio.h>
#include<conio.h>
#include<time.h>
void display( )
{
printf("%u sec elapsed\n",(clock()/(CLOCKS_PER_SEC)));
 }
main()
{  getch();
display();
//gives cpu frequency
printf("cpu frequency is  %u Ghz",CLOCKS_PER_SEC/1000000 );
}