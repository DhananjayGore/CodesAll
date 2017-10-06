 import time
 time.time() gives time in second since 1-1-1970


 def num(max):
        t1=time.time()
        for i in range(0,max):
                print(i)
        t2=time.time()
    print(str(t2-t1))
  File "<stdin>", line 6
    print(str(t2-t1))
        ^
SyntaxError: invalid syntax
>>> time.asctime()
'Mon May 16 03:24:40 2016'
tup=(1994,9,6,23,30,44,4,0,0)
>>> time.asctime(tup)
'Fri Sep  6 23:30:44 1994'


>>> time.localtime()
#gives localtime
time.struct_time(tm_year=2016, tm_mon=5, tm_mday=16, tm_hour=3, tm_min=30, tm_sec=38, tm_wday=0, tm_yday=137, tm_isdst=0)
>>> t=time.localtime()
>>> year=t[0]
>>> day=t[2]
>>> month=t[1]
>>> day
16
>>> month
5
>>> 


>>> for i in range(0,5):
...     print(i)
...     time.sleep(1)#sleep
... 
0
1
2
3
4

