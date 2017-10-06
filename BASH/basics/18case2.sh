echo "enter:\c"
read var
case $var in
[aeiou]* | [AEIOU]*)
					echo "word begins with vowel"
					;;
[0-9]*)
					echo "word begins with num"
					;;
*[0-9])
					echo "word ends with num"
					;;
???)
					echo "3 letter word"
					;;
*)
					echo "i dont know"
					;;
esac										