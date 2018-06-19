/* 
isprint(ch);
iscntrl(ch);
gives non zero value if character passed is a printable or control character respectively;
*/
#include<stdio.h>
#include<conio.h>
#include<ctype.h>
main()
{ //char ch= 'c';
char ch= '\n';//New line
if (isprint (ch))
printf("%c is a printable character\n",ch);
else
printf("%c is not a printable character\n",ch);

if (iscntrl (ch))
printf("%c is a controle character\n",ch);
else
printf("%c is not a controle character\n",ch);
}