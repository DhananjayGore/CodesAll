 from bs4 import BeautifulSoup
>>> htmldoc="""<!doctype html>
... <html><head><title>The Love Story</title> </head>
... <body>
... <p class+"title"><b>The Love Story</b></p>
... <p class="story">Once upon a time
... <a class="lovers "href=" " id ="l1">boy</a>
... <a class="lovers "href=" " id ="l1">girl</a>
... <a class="lovers "href=" " id ="l1">together</a>
... and they lived at bottom of well.</p>
... <p class="story">...</p>
... </body></html>
... """
>>> soup=BeautifulSoup(htmldoc,"html.parser")
>>> heads=soup.head
>>> heads
<head><title>The Love Story</title> </head>
>>> heads.contents
[<title>The Love Story</title>, u' ']
>>> bodys=soup.body
>>> for i in bodys.children:
...     print(i)
... 


<p class+"title"=""><b>The Love Story</b></p>


<p class="story">Once upon a time
<a class="lovers " href=" " id="l1">boy</a>
<a class="lovers " href=" " id="l1">girl</a>
<a class="lovers " href=" " id="l1">together</a>
and they lived at bottom of well.</p>


<p class="story">...</p>


>>> for i in bodys.descendants:
...     print(i)
... 


<p class+"title"=""><b>The Love Story</b></p>
<b>The Love Story</b>
The Love Story


<p class="story">Once upon a time
<a class="lovers " href=" " id="l1">boy</a>
<a class="lovers " href=" " id="l1">girl</a>
<a class="lovers " href=" " id="l1">together</a>
and they lived at bottom of well.</p>
Once upon a time

<a class="lovers " href=" " id="l1">boy</a>
boy


<a class="lovers " href=" " id="l1">girl</a>
girl


<a class="lovers " href=" " id="l1">together</a>
together

and they lived at bottom of well.


<p class="story">...</p>
...


>>> heads
<head><title>The Love Story</title> </head>
>>> heads.string
#not working
>>> heads.title.string
u'The Love Story'
>>> heads.title.parent
<head><title>The Love Story</title> </head>
>>> 
