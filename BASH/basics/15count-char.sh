echo "enter:\c"
read var
if [ `echo $var | wc -c` -eq 2 ]
	#2 is used becoz with every char a additional char is added
then
	echo "char recieved"
else
	echo "invalid"
fi