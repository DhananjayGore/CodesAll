/* int rename("old name","new name");
return 0 if successful else non zero;*/

#include<stdio.h>
int main()
{
if (((rename("rename.txt","rename1.txt")))==0)
printf("success!");
else
printf("failed!");

return 0;
}