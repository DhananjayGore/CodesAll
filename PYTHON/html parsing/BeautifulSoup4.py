from bs4 import BeautifulSoup
>>> doc="""<!doctype html>
... <html><head><title>"The Love Story"</title> </head>
... <body>
... <p class+"title"><b>"The Love Story"</b></p>
... <p class="story">"Once upon a time"
... <a class="lovers "href=" " id ="l1">boy</a>
... <a class="lovers "href=" " id ="l2">girl</a>
... <a class="lovers "href=" " id ="l3">together</a>
... "and they lived at bottom of well."</p>
... <p class="story">...</p>
... </body></html>
... """
>>> soup=BeautifulSoup(doc,"html.parser")
>>> soup.find_all('p')
[<p class+"title"=""><b>"The Love Story"</b></p>, <p class="story">"Once upon a time"\n<a class="lovers " href=" " id="l1">boy</a>\n<a class="lovers " href=" " id="l2">girl</a>\n<a class="lovers " href=" " id="l3">together</a>\n"and they lived at bottom of well."</p>, <p class="story">...</p>]
>>> soup.find_all('a')
[<a class="lovers " href=" " id="l1">boy</a>, <a class="lovers " href=" " id="l2">girl</a>, <a class="lovers " href=" " id="l3">together</a>]
>>> soup.find_all(id='l2')
[<a class="lovers " href=" " id="l2">girl</a>]
>>> soup.find_all("a",id='l2')
[<a class="lovers " href=" " id="l2">girl</a>]
>>> import re
>>> for tag in soup.find_all(re.compile("^b")):
...     print(tag.name)
... 
body
b
>>> for tag in soup.find_all(re.compile("^t")):
...     print(tag.name)
... 
title
>>> for tag in soup.find_all(re.compile("t")):
...     print(tag.name)
... 
html
title
>>> soup.find_all(href=re.compile('boy'))
[]
