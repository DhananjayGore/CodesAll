from bs4 import BeautifulSoup
>>> soup=BeautifulSoup("<html><p> asdfgh<strong>Hello<a>Hello</html>","html.parser")
>>> soup.prettify()
u'<html>\n <p>\n  asdfgh\n  <strong>\n   Hello\n   <a>\n    Hello\n   </a>\n  </strong>\n </p>\n</html>'
>>> print(soup.prettify())
<html>
 <p>
  asdfgh
  <strong>
   Hello
   <a>
    Hello
   </a>
  </strong>
 </p>
</html>
>>> 
