echo "enter num > 50 n <100"
read num
if [ $num -le 100 -a $num -ge 50 ]
then
	echo "good"
else
	echo "bad"
	#statements
fi