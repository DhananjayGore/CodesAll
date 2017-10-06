import random
print(random.randint(0,100))

cguess=int(random.randint(0,100))
while True:
	uguess=int(input("guess a number in (0,100)"))
	if uguess<cguess:
		print("guess lower")
	elif uguess>cguess:
		print("guess higher")
	else:
		print("u win")
		break