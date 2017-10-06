from PIL import Image
#import webbrowser
import math 

size=width,height=32,32
img=Image.new("L", size, "white")
pix=img.load()

for i in range (0,31):
	for j in range (0,31):
	    sqsum=i*i+j*j
	    sqrt=math.sqrt(sqsum)
	    sine=math.sin(sqrt)
	    absval=abs(sine)
	    pix[i,j]=absval
img.show()
