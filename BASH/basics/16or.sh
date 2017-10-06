echo "enter:\c"
read var
if [ `echo $var | wc -c` -eq 2 ]
	#2 is used becoz with every char a additional char is added
then
	if [ $var = a -o $var = e -o $var = i -o $var = o -o  $var = u ]
	then
		echo "vovel"
	else
		echo "not vowel"
		#statements
	fi
else
	echo "invalid"
fi