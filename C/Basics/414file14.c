/*rewind(file pointer);
puts the reading pointer back to start;
the second while loop won't work without it
*/

#include<stdio.h>
int main()
{ FILE *fp;
fp=fopen("mahi.txt","r");
while (!feof (fp))
{
putchar(fgetc(fp));
}
//rewind(fp);
while (!feof (fp))
{
putchar(fgetc(fp));
}
return 0;
}