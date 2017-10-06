Python 3.5.1 (v3.5.1:37a07cee5969, Dec  6 2015, 01:38:48) [MSC v.1900 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> import os
>>> a=[a,s,d,f]
Traceback (most recent call last):
  File "<pyshell#1>", line 1, in <module>
    a=[a,s,d,f]
NameError: name 'a' is not defined
>>> a=[1,2,3,4,5]
>>> a
[1, 2, 3, 4, 5]
>>> len a
SyntaxError: invalid syntax
>>> del a[1]
>>> a
[1, 3, 4, 5]
>>> b=[9,8,7,6]
>>> b
[9, 8, 7, 6]
>>> c=a+b
>>> c
[1, 3, 4, 5, 9, 8, 7, 6]
>>> len(a)
4
>>> max (c)
9
>>> min (c)
1
>>> c.append(900)
>>> c
[1, 3, 4, 5, 9, 8, 7, 6, 900]
>>> 

>>> a='mahi'
>>> a
'mahi'
>>> b='chouhan'
>>> b
'chouhan'
>>> s=a+b
>>> s
'mahichouhan'
>>> r=a+" "+c
Traceback (most recent call last):
  File "<pyshell#23>", line 1, in <module>
    r=a+" "+c
TypeError: Can't convert 'list' object to str implicitly
>>> r=a+' '+b
>>> r
'mahi chouhan'
>>> c
[1, 3, 4, 5, 9, 8, 7, 6, 900]
>>> c.count(1)
1
>>> c.append(1)
>>> c
[1, 3, 4, 5, 9, 8, 7, 6, 900, 1]
>>> c.count(1)
2
>>> 
