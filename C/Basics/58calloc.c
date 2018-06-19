/* void *calloc (no.-of-items,size-of-each);
return d address of first byte of first item;
*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{ int *pointer,j,length;
printf("enter number of items\n ");
scanf("%d",&length );
pointer=(int *) calloc(length,sizeof (int));
if (pointer==NULL )
printf("failed allocation");
else
{
for (j=0 ;j<length ;j++) 
{
printf ("enter val for item %d\n",++j); 
scanf ("%d",&pointer[j]);
}
for (j=0 ;j<length ;j++) 
printf ("%d\n",pointer[j]);
free (pointer);

}
}