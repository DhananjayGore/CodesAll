class parent:
	def func(self):
		print("parent")

class child(parent):
	def func(self):
		print("child")

"""
>>> class parent:
...     def func(self):
...             print("parent")
... 
>>> class child(parent):
...     def func(self):
...             print("child")
... 
>>> o=child()
o.func()
child
>>> 
"""
#if parent and child both have fn with same name the child one gets priority
o=child()
o.func()