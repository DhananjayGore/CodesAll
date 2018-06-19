//case using character
//works bcoz of ASCII value of character which is an integer
#include<stdio.h>
#include<conio.h>
main()
{char x;
	printf("enter character\n");
	scanf("%c",&x);
	switch (x)
	{case 'a':
	case 'A':
	case 'e':
	case 'E':
	case 'I':
	case 'i':
	case 'o':
	case 'O':
	case 'u':
	case 'U':
	printf("vowel");
	break;
	default :
	printf("consonant");
	}
	
}