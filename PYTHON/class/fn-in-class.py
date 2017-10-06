class Name:
	def __init__(self,attribute1,attribute2,attribute3):
		self.attribute1=attribute1
		self.attribute2=attribute2
		self.attribute3=attribute3
	def display(self):
		return("attribute1 is "+object1.attribute1+" attribute2 is "+str(object1.attribute2)+" attribute3 is "+object1.attribute3)

#init initialise definition
#self is the Name
object1=Name("mahi",12,"8th")


"""
class Name:
...     def __init__(self,attribute1,attribute2,attribute3):
...             self.attribute1=attribute1
...             self.attribute2=attribute2
...             self.attribute3=attribute3
...     def display(self):
...             return("attribute1 is"+object1.attribute1+"attribute2 is"+str(object1.attribute2)+"attribute3 is"+object1.attribute3)
... 
>>> object1.display()
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'object1' is not defined
>>> object1=Name("mahi",12,"8th")
>>> object1.display()
'attribute1 ismahiattribute2 is12attribute3 is8th'
>>> 
"""