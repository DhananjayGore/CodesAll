/* 
size_t strftime (char *str time_t max-size ,const char *fmt,const struct tm *time);
%A weekday
 %B month
 %c std date time string
  %H hour(0-23)
  %I hour (0-11)
  %p AM/PM
  %M minutes (0-59)
  %S second (0-60)
  %X std time string
  %Z time zone
*/
#include<stdio.h>
#include<conio.h>
#include<time.h>
main()
{ struct tm *ptr;
time_t t;
char str[100 ];
t=time(NULL);
ptr=localtime(&t);
strftime (str,100,"it's now %I %p %M %S\n time zone is %Z",ptr);
puts(str);
}