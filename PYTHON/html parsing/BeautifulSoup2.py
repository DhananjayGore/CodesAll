 html_doc="""
... <!DOCTYPE html>
... <html>
...     <head>
...             <link href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css" rel="stylesheet">
...           <link href='http://fonts.googleapis.com/css?family=Raleway|Open+Sans|Oxygen|Allura' rel='stylesheet' type='text/css'>
...            <link type="text/css" rel="stylesheet" href="index.css"/>
...            <title>MAHAVEER CHOUHAN</title>
...     </head>
...     <body>
...     <div class="first">
...       <div class="container"></br>
...             <ul class="pull-left">
...                 <li><a href="index.html">HOME</a></li>
...                     <li><a href="mynitc/mynitc.html">MY NITC</a></li>
...                     <li><a href="image.html">IMAGES</a></li>
...         </ul>
...         <ul class="pull-right">             
...                     <li><a href="signup/signup.html">SIGN UP</a></li> 
...                     <li><a href="signin/signin.html">SIGN IN</a></li> 
...                     <li><a href="aboutme/aboutme.html">ABOUT ME</a></li>
...                     <li><a href="contactme/contactme.html">CONTACT ME</a></li>
...         </ul>
...       </div>
...     </div>
...     <div class="second"> 
...         <div class="container">
...             <h1 class="pull-right">Push The Limits.</h1></br>
...             <p class="pull-left">MAHAVEER CHOUHAN</p>
...             </div></br></br>
...      <center>
... <p style="color:white;font-size:40px;font-family:Aeal">HOME</p>
... <p style="font-family: Allura,cursive;color:#FF1493">Welcome to my Homepage. Have a Good Day</p>
... </center>
... </div>
... 
...     <div class="bdy"><center>
... <h2>To connect eduserver using file maneger </h2>
...          <ol> 
...               <li>In the file manager, click Connect to server.</li>
...               <li>Type<br>ssh://username@athena.nitc.ac.in<br>or<br>ssh://username@192.168.40.99</li>
...               <li>DONE</li>
...         </ol>
...         <h2>To open your NITC MAIL in GMAIL </h2>
...         <ol>
...              <li>Open Gmail login page</li>
...              <li>Type<br>username@nitc.ac.in</li>
...              <li>Pasword is your "rollnumber" without doublequote("")</li>
...              <li>DONE</li>
...        </ol>
...        <h2>To connect athena using Terminal</h2>
...        <ol>  
...              <li>Open Terminal, Using (clt+alt+t).</li>
...              <li>Type<br>ssh username@athena.nitc.ac.in<br>or<br>ssh username@192.168.40.99</li>
...              <li>DONE</li>
...        </ol></center>
...     </div>
... </br></br><ul class="end">
...                <center> <li><a href="index.html">HOME</a></li>
...                     <li><a href="mynitc/mynitc.html">MY NITC</a></li>
...                     <li><a href="image.html">IMAGES</a></li>
...             <li><a href="signup/signup.html">SIGN UP</a></li> 
...                     <li><a href="signin/signin.html">SIGN IN</a></li> 
...                     <li><a href="aboutme/aboutme.html">ABOUT ME</a></li>
...                     <li><a href="contactme/contactme.html">CONTACT ME</a></li></center>
...         </ul></br><hr>
... <center><p>Copyright &copy; 2014&ndash;2018 MAHAVEER CHOUHAN.</p></center></br>
... 
...     </body>
...     
... </html>
... """
>>> \
... 
>>> from bs4 import BeautifulSoup
>>> soup=BeautifulSoup(html_doc,"html.parser")
>>> soup
\n<!DOCTYPE html>\n\n<html>\n<head>\n<link href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css" rel="stylesheet">\n<link href="http://fonts.googleapis.com/css?family=Raleway|Open+Sans|Oxygen|Allura" rel="stylesheet" type="text/css">\n<link href="index.css" rel="stylesheet" type="text/css"/>\n<title>MAHAVEER CHOUHAN</title>\n</link></link></head>\n<body>\n<div class="first">\n<div class="container"></div></div></body></html>\n<ul class="pull-left">\n<li><a href="index.html">HOME</a></li>\n<li><a href="mynitc/mynitc.html">MY NITC</a></li>\n<li><a href="image.html">IMAGES</a></li>\n</ul>\n<ul class="pull-right">\n<li><a href="signup/signup.html">SIGN UP</a></li>\n<li><a href="signin/signin.html">SIGN IN</a></li>\n<li><a href="aboutme/aboutme.html">ABOUT ME</a></li>\n<li><a href="contactme/contactme.html">CONTACT ME</a></li>\n</ul>\n\n\n<div class="second">\n<div class="container">\n<h1 class="pull-right">Push The Limits.</h1></div></div>\n<p class="pull-left">MAHAVEER CHOUHAN</p>\n\n<center>\n<p style="color:white;font-size:40px;font-family:Aeal">HOME</p>\n<p style="font-family: Allura,cursive;color:#FF1493">Welcome to my Homepage. Have a Good Day</p>\n</center>\n\n<div class="bdy"><center>\n<h2>To connect eduserver using file maneger </h2>\n<ol>\n<li>In the file manager, click Connect to server.</li>\n<li>Type<br>ssh://username@athena.nitc.ac.in<br>or<br>ssh://username@192.168.40.99</br></br></br></li>\n<li>DONE</li>\n</ol>\n<h2>To open your NITC MAIL in GMAIL </h2>\n<ol>\n<li>Open Gmail login page</li>\n<li>Type<br>username@nitc.ac.in</br></li>\n<li>Pasword is your "rollnumber" without doublequote("")</li>\n<li>DONE</li>\n</ol>\n<h2>To connect athena using Terminal</h2>\n<ol>\n<li>Open Terminal, Using (clt+alt+t).</li>\n<li>Type<br>ssh username@athena.nitc.ac.in<br>or<br>ssh username@192.168.40.99</br></br></br></li>\n<li>DONE</li>\n</ol></center>\n</div>\n<ul class="end">\n<center> <li><a href="index.html">HOME</a></li>\n<li><a href="mynitc/mynitc.html">MY NITC</a></li>\n<li><a href="image.html">IMAGES</a></li>\n<li><a href="signup/signup.html">SIGN UP</a></li>\n<li><a href="signin/signin.html">SIGN IN</a></li>\n<li><a href="aboutme/aboutme.html">ABOUT ME</a></li>\n<li><a href="contactme/contactme.html">CONTACT ME</a></li></center>\n</ul><hr>\n<center><p>Copyright \xa9 2014\u20132018 MAHAVEER CHOUHAN.</p></center></hr>\n\n\n
>>> soup.prettify()
u'<!DOCTYPE html>\n<html>\n <head>\n  <link href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css" rel="stylesheet">\n   <link href="http://fonts.googleapis.com/css?family=Raleway|Open+Sans|Oxygen|Allura" rel="stylesheet" type="text/css">\n    <link href="index.css" rel="stylesheet" type="text/css"/>\n    <title>\n     MAHAVEER CHOUHAN\n    </title>\n   </link>\n  </link>\n </head>\n <body>\n  <div class="first">\n   <div class="container">\n   </div>\n  </div>\n </body>\n</html>\n<ul class="pull-left">\n <li>\n  <a href="index.html">\n   HOME\n  </a>\n </li>\n <li>\n  <a href="mynitc/mynitc.html">\n   MY NITC\n  </a>\n </li>\n <li>\n  <a href="image.html">\n   IMAGES\n  </a>\n </li>\n</ul>\n<ul class="pull-right">\n <li>\n  <a href="signup/signup.html">\n   SIGN UP\n  </a>\n </li>\n <li>\n  <a href="signin/signin.html">\n   SIGN IN\n  </a>\n </li>\n <li>\n  <a href="aboutme/aboutme.html">\n   ABOUT ME\n  </a>\n </li>\n <li>\n  <a href="contactme/contactme.html">\n   CONTACT ME\n  </a>\n </li>\n</ul>\n<div class="second">\n <div class="container">\n  <h1 class="pull-right">\n   Push The Limits.\n  </h1>\n </div>\n</div>\n<p class="pull-left">\n MAHAVEER CHOUHAN\n</p>\n<center>\n <p style="color:white;font-size:40px;font-family:Aeal">\n  HOME\n </p>\n <p style="font-family: Allura,cursive;color:#FF1493">\n  Welcome to my Homepage. Have a Good Day\n </p>\n</center>\n<div class="bdy">\n <center>\n  <h2>\n   To connect eduserver using file maneger\n  </h2>\n  <ol>\n   <li>\n    In the file manager, click Connect to server.\n   </li>\n   <li>\n    Type\n    <br>\n     ssh://username@athena.nitc.ac.in\n     <br>\n      or\n      <br>\n       ssh://username@192.168.40.99\n      </br>\n     </br>\n    </br>\n   </li>\n   <li>\n    DONE\n   </li>\n  </ol>\n  <h2>\n   To open your NITC MAIL in GMAIL\n  </h2>\n  <ol>\n   <li>\n    Open Gmail login page\n   </li>\n   <li>\n    Type\n    <br>\n     username@nitc.ac.in\n    </br>\n   </li>\n   <li>\n    Pasword is your "rollnumber" without doublequote("")\n   </li>\n   <li>\n    DONE\n   </li>\n  </ol>\n  <h2>\n   To connect athena using Terminal\n  </h2>\n  <ol>\n   <li>\n    Open Terminal, Using (clt+alt+t).\n   </li>\n   <li>\n    Type\n    <br>\n     ssh username@athena.nitc.ac.in\n     <br>\n      or\n      <br>\n       ssh username@192.168.40.99\n      </br>\n     </br>\n    </br>\n   </li>\n   <li>\n    DONE\n   </li>\n  </ol>\n </center>\n</div>\n<ul class="end">\n <center>\n  <li>\n   <a href="index.html">\n    HOME\n   </a>\n  </li>\n  <li>\n   <a href="mynitc/mynitc.html">\n    MY NITC\n   </a>\n  </li>\n  <li>\n   <a href="image.html">\n    IMAGES\n   </a>\n  </li>\n  <li>\n   <a href="signup/signup.html">\n    SIGN UP\n   </a>\n  </li>\n  <li>\n   <a href="signin/signin.html">\n    SIGN IN\n   </a>\n  </li>\n  <li>\n   <a href="aboutme/aboutme.html">\n    ABOUT ME\n   </a>\n  </li>\n  <li>\n   <a href="contactme/contactme.html">\n    CONTACT ME\n   </a>\n  </li>\n </center>\n</ul>\n<hr>\n <center>\n  <p>\n   Copyright \xa9 2014\u20132018 MAHAVEER CHOUHAN.\n  </p>\n </center>\n</hr>\n'
>>> print(soup.prettify())
<!DOCTYPE html>
<html>
 <head>
  <link href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css" rel="stylesheet">
   <link href="http://fonts.googleapis.com/css?family=Raleway|Open+Sans|Oxygen|Allura" rel="stylesheet" type="text/css">
    <link href="index.css" rel="stylesheet" type="text/css"/>
    <title>
     MAHAVEER CHOUHAN
    </title>
   </link>
  </link>
 </head>
 <body>
  <div class="first">
   <div class="container">
   </div>
  </div>
 </body>
</html>
<ul class="pull-left">
 <li>
  <a href="index.html">
   HOME
  </a>
 </li>
 <li>
  <a href="mynitc/mynitc.html">
   MY NITC
  </a>
 </li>
 <li>
  <a href="image.html">
   IMAGES
  </a>
 </li>
</ul>
<ul class="pull-right">
 <li>
  <a href="signup/signup.html">
   SIGN UP
  </a>
 </li>
 <li>
  <a href="signin/signin.html">
   SIGN IN
  </a>
 </li>
 <li>
  <a href="aboutme/aboutme.html">
   ABOUT ME
  </a>
 </li>
 <li>
  <a href="contactme/contactme.html">
   CONTACT ME
  </a>
 </li>
</ul>
<div class="second">
 <div class="container">
  <h1 class="pull-right">
   Push The Limits.
  </h1>
 </div>
</div>
<p class="pull-left">
 MAHAVEER CHOUHAN
</p>
<center>
 <p style="color:white;font-size:40px;font-family:Aeal">
  HOME
 </p>
 <p style="font-family: Allura,cursive;color:#FF1493">
  Welcome to my Homepage. Have a Good Day
 </p>
</center>
<div class="bdy">
 <center>
  <h2>
   To connect eduserver using file maneger
  </h2>
  <ol>
   <li>
    In the file manager, click Connect to server.
   </li>
   <li>
    Type
    <br>
     ssh://username@athena.nitc.ac.in
     <br>
      or
      <br>
       ssh://username@192.168.40.99
      </br>
     </br>
    </br>
   </li>
   <li>
    DONE
   </li>
  </ol>
  <h2>
   To open your NITC MAIL in GMAIL
  </h2>
  <ol>
   <li>
    Open Gmail login page
   </li>
   <li>
    Type
    <br>
     username@nitc.ac.in
    </br>
   </li>
   <li>
    Pasword is your "rollnumber" without doublequote("")
   </li>
   <li>
    DONE
   </li>
  </ol>
  <h2>
   To connect athena using Terminal
  </h2>
  <ol>
   <li>
    Open Terminal, Using (clt+alt+t).
   </li>
   <li>
    Type
    <br>
     ssh username@athena.nitc.ac.in
     <br>
      or
      <br>
       ssh username@192.168.40.99
      </br>
     </br>
    </br>
   </li>
   <li>
    DONE
   </li>
  </ol>
 </center>
</div>
<ul class="end">
 <center>
  <li>
   <a href="index.html">
    HOME
   </a>
  </li>
  <li>
   <a href="mynitc/mynitc.html">
    MY NITC
   </a>
  </li>
  <li>
   <a href="image.html">
    IMAGES
   </a>
  </li>
  <li>
   <a href="signup/signup.html">
    SIGN UP
   </a>
  </li>
  <li>
   <a href="signin/signin.html">
    SIGN IN
   </a>
  </li>
  <li>
   <a href="aboutme/aboutme.html">
    ABOUT ME
   </a>
  </li>
  <li>
   <a href="contactme/contactme.html">
    CONTACT ME
   </a>
  </li>
 </center>
</ul>
<hr>
 <center>
  <p>
   Copyright © 2014–2018 MAHAVEER CHOUHAN.
  </p>
 </center>
</hr>

>>> soup.title
<title>MAHAVEER CHOUHAN</title>
>>> soup.body
<body>\n<div class="first">\n<div class="container"></div></div></body>
>>> soup.a
<a href="index.html">HOME</a>
>>> soup.find_all('a')
[<a href="index.html">HOME</a>, <a href="mynitc/mynitc.html">MY NITC</a>, <a href="image.html">IMAGES</a>, <a href="signup/signup.html">SIGN UP</a>, <a href="signin/signin.html">SIGN IN</a>, <a href="aboutme/aboutme.html">ABOUT ME</a>, <a href="contactme/contactme.html">CONTACT ME</a>, <a href="index.html">HOME</a>, <a href="mynitc/mynitc.html">MY NITC</a>, <a href="image.html">IMAGES</a>, <a href="signup/signup.html">SIGN UP</a>, <a href="signin/signin.html">SIGN IN</a>, <a href="aboutme/aboutme.html">ABOUT ME</a>, <a href="contactme/contactme.html">CONTACT ME</a>]
>>> soup.body.a
>>> soup.body.div
<div class="first">\n<div class="container"></div></div>
>>> array=soup.find_all('a')
>>> array[0]
<a href="index.html">HOME</a>
>>> array[1]
<a href="mynitc/mynitc.html">MY NITC</a>
>>> array[2]
<a href="image.html">IMAGES</a>

