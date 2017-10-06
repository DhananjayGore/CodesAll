 #first create file (prefferably global directory)
 f1=open("test.txt","r")
 f1.read()
 f1.tell()
 f1.seek(0,0)
 f1.read()
 f1.seek(0)
 f1.read(5)


f=open("mahi.txt","w")
f.write("python wrote this shit")
f.close
f.close()
f.read()
f=open("mahi.txt","r")
f.read()
'python wrote this shit'

 """
 f1=open("test.txt","r")
>>> f1.read()
#reads file upto end if no arguement is given
'hi \nthis is test file\nseriously!!!'
>>> 
f1.tell()
#gives cursor location
34
>>> f1.seek(0,0)
#shift cursor to 0
>>> f1.read()
'hi \nthis is test file\nseriously!!!'
f1.seek(0)
>>> f1.read()
'hi \nthis is test file\nseriously!!!'
f1.read(5)
'hi \nt'

f=open("mahi.txt","w")
>>> f.write("python wrote this shit")
>>> f.close
<built-in method close of file object at 0x7fc2ada615d0>
>>> f.close()
>>> f.read()
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
ValueError: I/O operation on closed file
>>> f=open("mahi.txt","r")
>>> f.read()
'python wrote this shit'
>>> 


"""

#NOT WORKING

ufn =input("enter ur file-name: ")#not worked
testfile
ufn=ufn+"txt"
f1=open(ufn,"r")
f2=open("copied.txt","w")
f2.write(f1.read())

f1.close()
f2.close()
f2=open("copied.txt","r")
f2.read()

"""
f1=open("mahi.txt","r")
>>> f2=open("copied2.txt","w")
>>> f2.write(f1.read())
>>> f1.read()
''
>>> f1.write("python did this one")
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
IOError: File not open for writing
>>> f1=open("mahi.txt","w")
>>> f1.write("python did this one")
>>> f1=open("mahi.txt","r")
>>> f2.write(f1.read())
>>> f1.read()
''
>>> f1.seek(0)
>>> f1.read()
'python did this one'
>>> f2.write(f1.read())
>>> f2.read()
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
IOError: File not open for reading
>>> f2=open("mahi.txt","r")
>>> f2.read()
'python did this one'
>>> 
"""





