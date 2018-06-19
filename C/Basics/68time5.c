/*
double difftime(time_t t2,time_t t1);
clock_t clock(void);
/CLOCKS_PER_SEC
*/
#include<stdio.h>
#include<conio.h>
#include<time.h>
main()
{  time_t start,end;
int j;
start =time(NULL);
//for (j=0 ;j<5000000 ;j++ )
getch( );
end =time(NULL);
printf("%d cycles elapsed  ", (difftime(end,start)));

}