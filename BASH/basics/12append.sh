echo "enter name"
read name
if [ -f $name ]
then
	if [ -w $name ]
	then
		 echo  "enter text to append"
		 cat >> $name
	fi
	#statements
else
	echo "permission denied"
fi