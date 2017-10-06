echo "enter:\c"
read var
case $var in
[a-z])
	echo "lower case"
	;;
[A-Z])
	echo "upper case"
	;;
[0-9])
	echo "digit"
	;;
?)
	echo "speccial symbol"
	;;
*)
	echo "more than one chars"
	;;
esac