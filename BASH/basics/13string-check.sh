str1="hi"
str2="jaan"
str3=""

[ "$str1" = "str2" ]
echo $?

[ "$str1" != "str2" ]
echo $?

[ -n "str1" ]
echo $?
#doubt
#check null

[ -z "str3" ]
echo $?
#check zero length

