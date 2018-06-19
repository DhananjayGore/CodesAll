/* int remove("name");
return 0 if successful else non zero;
also path can be specified
remove("a/mahi.txt");
*/

#include<stdio.h>

int main()
{
if (((remove("rename1.txt")))==0)
printf("success!");
else
printf("failed! %d",((remove("rename1.txt"))));
return 0;
}