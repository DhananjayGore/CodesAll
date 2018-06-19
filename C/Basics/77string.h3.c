/*
void *memcpy(void *to,const void *from,size_t length);
copies first length number of character from "from" to "to";
*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{ int size =20;
char from[size];
char to[size];
strcpy (from,"mahi rocks");
memcpy(to,from,1);
puts(to);
puts(from);
}