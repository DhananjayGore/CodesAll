"""
a child gets all the  function and attributes of parent
"""

class parent:
	c=10
	def __init__(self):
		print("pclass started ")
	def pfunc(self):
		print("pfunc being called")
	def setc(self,num):
		parent.c=num
	def showc(self):
		print(str(parent.c))


class child(parent ):
	def __init__(self):
		print("class started ")
	def cfunc(self):
		print("cfunc called ")		


x=child()

"""
x=child()
class started 
>>> x.cfunc()
cfunc called 
>>> x.c
10
>>> x.pfunc()
pfunc being called
>>> setc(20)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'setc' is not defined
>>> x.setc(20)
>>> x.c
20
"""