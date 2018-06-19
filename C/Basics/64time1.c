/*
time_t time(time_t *time);
struct tm *localtime(time_t *time);
struct tm *gmtime(time_t *time);
*/
#include<stdio.h>
#include<conio.h>
#include<time.h>
main()
{ struct tm *local,*gm;
time_t t;
t=time(NULL );
local=localtime (&t);
printf("local time using local time fn\n");
printf("time->> %d:%d:%d\n ",local->tm_hour,local->tm_min,local->tm_sec);
printf("date->> %d/%d/%d\n ",local->tm_mday,local->tm_mon+1,local->tm_year+1900);
printf("this is the %d day of year\n",local->tm_yday+1);
printf("this is the %d day of week from sunday\n",local->tm_wday);

gm=gmtime(&t);
printf("using gm time fn\n");
printf("time->> %d:%d:%d\n ",gm->tm_hour,gm->tm_min,gm->tm_sec);
printf("date->> %d/%d/%d\n ",gm->tm_mday,gm->tm_mon+1,gm->tm_year+1900);
printf("this is the %d day of year\n",gm->tm_yday+1);
printf("this is the %d day of week from sunday\n",gm->tm_wday);
}