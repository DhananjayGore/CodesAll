class st:
	def __init__(self,name,age):
		self.name=name
		self.age=age

o1=st("mahi",13)
hasattr(o1,'age')


"""
object(name,'attribute')  
gives true n false on the basis of availability of attribute in object
"""

"""
class st:
...     def __init__(self,name,age):
...             self.name=name
...             self.age=age
... 
>>> o1=st("mahi",14)
>>> hasattr(o1,age)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
NameError: name 'age' is not defined
>>> hasattr(o1,'age')
True
"""

hasattr(o1,'grade')
"""
setattr(o1,'attribute-name','attribute-val')  adds attribute to o1

 hasattr(o1,'grade')
False
>>> setattr(o1,'grade',"8th")
>>> o1.grade
'8th'

"""
setattr(o1,'grade',"8th")
o1.grade

"""
getattr(object,'attribute') gives attribute val of object
"""
##getattr(o1,'grade') is equal to o1.grade
getattr(o1,'grade')

"""
getattr(o1,'grade')
'8th'
>>> o1.grade
'8th'
"""
"""
delattr(o1,'attribute') deletes attribute
"""
delattr(o1,'grade')
hasattr(o1,'grade')

"""
delattr(o1,'grade')
hasattr(o1,'grade')
False
"""





