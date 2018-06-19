/* isalpha(ch);
isalnum(ch);
isdigit(ch );
gives null if fails
*/
#include<stdio.h>
#include<conio.h>
#include<ctype.h>
main()
{ char ch= 'c';
if (isalpha (ch))
printf("%c is a alphabet\n",ch);
else
printf("%c is a alphabet\n",ch );

if ( isalnum (ch))
printf("%c is a alphanumeric\n ",ch);
else
printf("%c is not a alphanumeric\n",ch);

if (isdigit(ch))
printf("%c is a digit\n",ch);
else
printf("%c is not a digit\n",ch);
}