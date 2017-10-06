a=30.3 b=12.1
c=`echo $a + $b |bc`
d=`echo  $a - $b |bc`
e=`echo  $a \* $b |bc`
f=`echo  $a / $b |bc`

echo $c $d $e $f
#give space always
#use brackets if needed