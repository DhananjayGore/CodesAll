/* 
isupper(ch);
islower(ch);
gives non zero value if character passed is in uppercase or lowercase character respectively;
*/
#include<stdio.h>
#include<conio.h>
#include<ctype.h>
main()
{ char ch= 'c';

if (isupper (ch))
printf("%c is a uppercase character\n",ch);
else
printf("%c is not a uppercase character\n",ch);

if (islower (ch))
printf("%c is a lowercase character\n",ch);
else
printf("%c is not a lowercase character\n",ch);
}