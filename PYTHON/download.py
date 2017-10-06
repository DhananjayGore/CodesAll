from bs4 import *
import urllib 
import urllib2
baseurl = "http://localhost/music/" 
soup = BeautifulSoup(urllib2.urlopen(baseurl))
links=soup.findAll("a")
for link in links[5:]:
	print link.text
	urllib.urlretrieve(baseurl+link.text,link.text)