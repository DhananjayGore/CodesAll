
#include<stdio.h>
#include<conio.h>
main()
{int number,j,isprime=0;

 printf("enter number to check prime or composite\n");
scanf("%d",&number);
for (j=2;j<= (number/2);j++)
{ if ((number%j)==0)
{ isprime=1;
break;
}
  }
 
 if (isprime ==0)
 printf("prime");
 else
 printf("composite");
}