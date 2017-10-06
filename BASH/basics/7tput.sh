#tput in action
tput clear
echo "rows"
tput lines
echo "clms"
tput cols
tput cup 15 20
#brings curser to  line 15 col 20
tput bold
#makes the following line bold
echo "ITS bold"
#  \033[0m escapes the bold
echo "\033[0mBye"