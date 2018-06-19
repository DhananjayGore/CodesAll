/* 
time_t mktime (struct tm *time);

  int tm_sec;			/* Seconds.	[0-60] (1 leap second) */
  int tm_min;			/* Minutes.	[0-59] */
  int tm_hour;			/* Hours.	[0-23] */
  int tm_mday;			/* Day.		[1-31] */
  int tm_mon;			/* Month.	[0-11] */
  int tm_year;			/* Year	- 1900.  */
  int tm_wday;			/* Day of week.	[0-6] */
  int tm_yday;			/* Days in year.[0-365]	*/
  int tm_isdst;			/* DST.		[-1/0/1]*/

#include<stdio.h>
#include<conio.h>
#include<time.h>
main()
{ struct tm t;
time_t tic;//time in cal;
t.tm_year=1996-1900;
t.tm_mon=8;//(0-11);
t.tm_mday=6;//(1-31;
t.tm_hour=0;
t.tm_min=0;
t.tm_sec=0;
t.tm_isdst=0;
tic=mktime(&t);
printf(ctime(&tic));
}