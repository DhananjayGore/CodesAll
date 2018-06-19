/* 
punctuation character are
( ) : ; , *= { } [ ]#
ispunct(ch);
gives non zero if punctuation marks
isspace(ch);
gives non zero if space or tab, carriage return, New line character, form feed ,vertical tab;
*/
#include<stdio.h>
#include<conio.h>
#include<ctype.h>
main()
{ char ch= '*';
//char ch =' ';
if (ispunct (ch))
printf("%c is a punctuation character\n",ch);
else
printf("%c is not a punctuation character\n",ch);

if (isspace (ch))
printf("%c is a white space character\n",ch);
else
printf("%c is not a white space character\n",ch);
}