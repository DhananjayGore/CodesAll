echo "enter num b/w  10 n 20"
read num
if [ $num -lt 10 ]
then
	echo "less then 10"

elif [ $num -gt 20 ]
then
	echo "greater than 20"
else
	echo "good job"
fi