python
Python 2.7.11+ (default, Apr 17 2016, 14:00:29) 
[GCC 5.3.1 20160413] on linux2
Type "help", "copyright", "credits" or "license" for more information.
>>> from bs4 import BeautifulSoup
>>> soup=BeautifulSoup("<html><p>asdfgh <strong> Hello")
/usr/lib/python2.7/dist-packages/bs4/__init__.py:166: UserWarning: No parser was explicitly specified, so I'm using the best available HTML parser for this system ("lxml"). This usually isn't a problem, but if you run this code on another system, or in a different virtual environment, it may use a different parser and behave differently.

To get rid of this warning, change this:

 BeautifulSoup([your markup])

to this:

 BeautifulSoup([your markup], "lxml")

  markup_type=markup_type))
>>> soup.prettify()
u'<html>\n <body>\n  <p>\n   asdfgh\n   <strong>\n    Hello\n   </strong>\n  </p>\n </body>\n</html>'
>>> print(soup.prettify())
<html>
 <body>
  <p>
   asdfgh
   <strong>
    Hello
   </strong>
  </p>
 </body>
</html>
>>> 
