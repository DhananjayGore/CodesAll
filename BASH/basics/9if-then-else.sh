echo "this program renames file"
#echo "\n"
echo "enter source n target"
read source target
#if (mv $source $target)
if mv $source $target

then
	#statements
	echo "renamed success"
else
	"renaming failed"
fi

