/* toupper(ch);
tolower(ch);
converts to uppercase or lowercase;

 
 */
#include<stdio.h>
#include<conio.h>
#include<ctype.h>
main()
{ char ch= 'c';
printf("uppercase of %c is %c\n",ch,toupper(ch) );
printf("lowercase of %c is %c\n ",ch,tolower(ch) );

printf("uppercase of %d is %d\n",ch,toupper(ch) );
printf("lowercase of %d is %d\n ",ch,tolower(ch) );
}