#//=========================================================\\#
#|| Written 4.21.10 by "Cobalt"                             ||#
#||---------------------------------------------------------||#
#|| PROGRAM REQUIREMENTS                                    ||#
#||  This program utilizes the "Myro" library, and runs     ||#
#||  under Python 2.4.4. Both the Myro Library and the      ||#
#||  correct version of Python can be downloaded from:      ||#
#|| http://wiki.roboteducation.org/Myro_Installation_Manual ||#
#||---------------------------------------------------------||#
#|| COPYRIGHT/USAGE NONSENSE:                               ||#
#||  The below code is provided "as is" with no strings     ||#
#||  attached. Feel free to edit/redistribute/whatever it.  ||#
#\\=========================================================//#

#Import statements
from myro import *
from random import randrange

#Global variables
board = [[None, None, None],[None, None, None],[None, None, None]]
plaWins = 0
comWins = 0
remainingMoves = 9
remove = []
twoPlayers = False

#Playing pieces. Feel free to edit these, actually. Just don't use pixmaps, because they anchor at their center instead of their UL point. :/
# Not really something I want to write a catch for. As a side note, I hate this bloody graphics library, but I have to admit that it's convenient.
plaPiece = Polygon(Point(0,0), Point(40, 40), Point(80, 0), Point(40, 40), Point(80, 80), Point(40, 40), Point(0, 80), Point(40, 40))
plaPiece.setWidth(6)
plaPiece.setOutline(color_rgb(0, 100, 0))
comPiece = Oval(Point(0, 0), Point(80, 80))
comPiece.setWidth(6)
comPiece.setOutline(color_rgb(100, 0, 0))
#End playing pieces

def init():
    global gameWindow
    global scoreText
    global buttonText
    
    gameWindow = GraphWin("Tic-tac-toe", 300, 400)
    #This is the game's frame - four dividers to form a 3x3 grid, plus a square to surround the whole thing
    gameFrame = [Rectangle(Point(3, 3), Point(300, 300)),
                 Line(Point(103, 0), Point(103, 300)),
                 Line(Point(203, 0), Point(203, 300)),
                 Line(Point(0, 103), Point(300, 103)),
                 Line(Point(0, 203), Point(300, 203))]
    #...I will never set attributes one by one again. Ever.
    for current in gameFrame:
        current.setWidth(3)
        current.setFill(color_rgb(255, 255, 255))
        current.setOutline(color_rgb(0, 64, 128))
        current.draw(gameWindow)

    #This is the scoring frame. The rectangle surrounds the entire lower window border,
    #and there is one vertical and one horizontal dividing line to separate the mode/quit buttons and the scores.
    scoreFrame = [Rectangle(Point(3, 303), Point(300, 400)),
                  Line(Point(148, 303), Point(148, 363)),
                  Line(Point(0, 363), Point(300, 363))]
    for current in scoreFrame:
        current.setWidth(3)
        current.setFill(color_rgb(200, 200, 200))
        current.setOutline(color_rgb(0, 64, 128))
        current.draw(gameWindow)

    #We don't set the text to anything significant at the moment... This will change after the board resets.
    scoreText = [Text(Point(75, 320), "Player Wins: 0"), Text(Point(225, 320), "Computer Wins: 0")]
    for current in scoreText:
        current.setFace("times roman")
        current.setStyle("italic")
        current.setFill(color_rgb(0, 0, 0))
        current.draw(gameWindow)

    #These are frames for our mode/quit buttons.
    buttonFrames = [Rectangle(Point(10, 370), Point(142, 393)), Rectangle(Point(155, 370), Point(293, 393))]
    for current in buttonFrames:
        current.setWidth(4)
        current.setFill(color_rgb(50, 200, 255))
        current.setOutline(color_rgb(50, 100, 255))
        current.draw(gameWindow)

    #And this is the text that goes inside those frames
    buttonText = [Text(Point(75, 380), "Two Players"), Text(Point(225, 380), "Quit Game")]
    for current in buttonText:
        current.setFace("courier")
        current.setFill(color_rgb(64, 64, 64))
        current.draw(gameWindow)
    
    return randrange(2) #Returns a randrange to determine next player. Yeah, I know. I know.

def main():
    global gameWindow
    global remove
    global twoPlayers
    global buttonText
    global scoreText

    playerTurn = init()
    indicator = Point(0, 0)
    buttonText[0].setText("Switch to 2P")
    playing = True
    while playing:
        indicator.undraw()
        if playerTurn == 1:
            indicator = Rectangle(Point(15, 335), Point(130, 355))
        else:
            indicator = Rectangle(Point(165, 335), Point(280, 355))
        indicator.setFill(color_rgb(0, 255, 0))
        indicator.setWidth(3)
        indicator.setOutline(color_rgb(0, 100, 0))
        indicator.draw(gameWindow)
        completed = False
        while(not completed):
            if playerTurn == 1:
                playerChoice = playerMove()

                #Break conditions for manual reset or quit
                if playerChoice == "switchmode":
                    completed = True
                    twoPlayers = not twoPlayers #Easy way of toggling
                    wait(0.5) #This prevents mouse capture from registering multiple clicks when the button was only clicked once...
                    break
                if playerChoice == "quit":
                    gameWindow.close()
                    completed = True
                    playing = False
                    break
                #End break conditions
                
                makeMove(playerChoice, "X")
                playerTurn = 0
                indicator.move(150, 0)

            #Player two's move
            elif twoPlayers:
                playerChoice = playerMove()

                #Break conditions for mode switch or quit
                if playerChoice == "switchmode":
                    completed = True
                    twoPlayers = not twoPlayers #Easy way of toggling
                    wait(0.5) #This prevents mouse capture from registering multiple clicks when the button was only clicked once...
                    break
                if playerChoice == "quit":
                    gameWindow.close()
                    completed = True
                    playing = False
                    break
                #End break conditions
                
                makeMove(playerChoice, "O")
                playerTurn = 1
                indicator.move(-150, 0)

            #Computer's move
            else:
                moves = comAI()
                wait(0.5) #Just to slow the computer down a little bit. :P
                makeMove(moves[randrange(len(moves))], "O")
                playerTurn = 1
                indicator.move(-150, 0)
            completed = checkBoard()
        indicator.undraw()
        playerTurn = reset(remove)
    return

def playerMove():
    global gameWindow
    global board

    coords = gameWindow.getMouse()
    if coords.getY() < 300 and board[coords.getX()/100][coords.getY()/100] == None:
        return (coords.getX()/100, coords.getY()/100)
    elif 10 < coords.getX() < 142 and 370 < coords.getY() < 393:
        return "switchmode"
    elif 155 < coords.getX() < 293 and 370 < coords.getY() < 393:
        return "quit"
    else:
        return playerMove()
    
def makeMove(pos, symbol):
    global remainingMoves
    global board
    global remove
    
    board[pos[0]][pos[1]] = symbol
    remainingMoves -= 1
    temp = updateBoard(remove)
    remove = temp
    return
    
def comAI():
    global board

    optimalMoves = []
    openMoves = []

    #Check rows
    for i in range(3):
        xHits = 0
        oHits = 0
        for j in range(3):
            if board[i][j] == "X":
                xHits += 1
            elif board[i][j] == "O":
                oHits += 1
            else:
                openMoves.append((i, j))

        #The second condition to these, "and xHits + oHits != 3" keeps the computer from cheating and overwriting your moves. :P
        if oHits == 2 and xHits + oHits != 3:
            return [openMoves[-1]] #Forces the computer to take the winning move, because we don't want randomness to influence this.
        elif xHits == 2 and xHits + oHits != 3:
            optimalMoves.append(openMoves[-1]) #Doesn't force the computer to block the player the first time it finds a row to block,
        #which makes the computer look slightly less predictable; it will block the player, but if there are two places to block,
        #we don't know which one it WILL block.

    #Check columns
    for j in range(3):
        xHits = 0
        oHits = 0
        for i in range(3):
            if board[i][j] == "X":
                xHits += 1
            elif board[i][j] == "O":
                oHits += 1
            else:
                openMoves.append((i, j))

        #The second condition to these, "and xHits + oHits != 3" keeps the computer from cheating and overwriting your moves. :P
        if oHits == 2 and xHits + oHits != 3:
            return [openMoves[-1]] #Forces the computer to take the winning move, because we don't want randomness to influence this.
        elif xHits == 2 and xHits + oHits != 3:
            optimalMoves.append(openMoves[-1]) #Doesn't force the computer to block the player the first time it finds a row to block,
        #which makes the computer look slightly less predictable; it will block the player, but if there are two places to block,
        #we don't know which one it WILL block.

    xHits = 0
    oHits = 0
    #Check "backslash" diag
    for i in range(3):
        if board[i][i] == "X":
            xHits += 1
        elif board[i][i] == "O":
            oHits += 1
        else:
            openMoves.append((i, i))

    #The second condition to these, "and xHits + oHits != 3" keeps the computer from cheating and overwriting your moves. :P
    if oHits == 2 and xHits + oHits != 3:
        return [openMoves[-1]] #Forces the computer to take the winning move, because we don't want randomness to influence this.
    elif xHits == 2 and xHits + oHits != 3:
        optimalMoves.append(openMoves[-1]) #Doesn't force the computer to block the player the first time it finds a row to block,
        #which makes the computer look slightly less predictable; it will block the player, but if there are two places to block,
        #we don't know which one it WILL block.
    
    xHits = 0
    oHits = 0
    #Check "forwardslash" diag
    for i in range(3):
        if board[2-i][i] == "X":
            xHits += 1
        elif board[2-i][i] == "O":
            oHits += 1
        else:
            openMoves.append((2-i, i))

    #The second condition to these, "and xHits + oHits != 3" keeps the computer from cheating and overwriting your moves. :P
    if oHits == 2 and xHits + oHits != 3:
        return [openMoves[-1]] #Forces the computer to take the winning move, because we don't want randomness to influence this.
    elif xHits == 2 and xHits + oHits != 3:
        optimalMoves.append(openMoves[-1]) #Doesn't force the computer to block the player the first time it finds a row to block,
        #which makes the computer look slightly less predictable; it will block the player, but if there are two places to block,
        #we don't know which one it WILL block.


    #Returns open moves only if optimal moves do not exist
        #EDIT: We do not filter duplicates from open moves any more because this gives a 3:2 preference to diagonals, which are better moves to make
    if len(optimalMoves) < 1:
        return openMoves
    
    return optimalMoves

def checkBoard():
    global remainingMoves
    global board
    
    #Check rows
    for i in range(3):
        #It took me forever to realize these had to be zeroed out at the start of each new column.
        #I kept wondering why the game ended whenever three moves were made.
        #Now I know. AND KNOWING IS HALF THE BATTLE!
        xHits = 0
        oHits = 0
        for j in range(3):
            #Basically tallys the number of hits we get for each symbol
            if board[i][j] == "X":
                xHits += 1
            elif board[i][j] == "O":
                oHits += 1
        #Kind of obvious what this section does - if there are three X hits, X has won. If there are three O hits, O has won.
        if xHits == 3:
            return endGame("X")
        elif oHits == 3:
            return endGame("O")
            
    
    #Check columns; VERY similar to checking rows. So similar in fact that all I did was swap the order in which it checks tiles. :B
    for j in range(3):
        xHits = 0
        oHits = 0
        for i in range(3):
            if board[i][j] == "X":
                xHits += 1
            elif board[i][j] == "O":
                oHits += 1
        if xHits == 3:
            return endGame("X")
        elif oHits == 3:
            return endGame("O")

    xHits = 0
    oHits = 0
    #Check descending diag; Marginally similar to the above two checks, but it's a little cleaner because there are only three tiles to check.
    for i in range(3):
        if board[i][i] == "X":
            xHits += 1
        elif board[i][i] == "O":
            oHits += 1
    if xHits == 3:
        return endGame("X")
    elif oHits == 3:
        return endGame("O")

    xHits = 0
    oHits = 0
    #Check ascending diag; Identical to checking the descending diagonal, except we flip the row's index so it starts at the bottom row and works up.
    for i in range(3):
        if board[2-i][i] == "X":
            xHits += 1
        elif board[2-i][i] == "O":
            oHits += 1
    if xHits == 3:
        return endGame("X")
    elif oHits == 3:
        return endGame("O")
    else:
        if remainingMoves != 0:
            return False
        else:
            return endGame()

def updateBoard(previous):
    global gameWindow
    global board
    global plaPiece
    global comPiece

    #Messy, but this makes it infinitely easier to clear the game board and draw new moves.
    for entry in previous:
        entry.undraw()
    
    render = []

    #Go through the board's entries, find whatever happens to be a valid tile and toss it into our list of things to render
    for row in range(3):
        for column in range(3):
            if board[row][column] == "X":
                #Add a new entry to Render, and make it a clone of the player's piece. This prevents aliasing, but it's also why we need to wipe the board every time it updates...
                #I'll likely figure out a way around this five minutes after I submit this program, just watch. >_>
                render.append(plaPiece.clone())
                #Move it into the correct position
                render[-1].move((row*100)+13, (column*100)+13)
            elif board[row][column] == "O":
                #See above for description of what these lines do
                render.append(comPiece.clone())
                render[-1].move((row*100)+13, (column*100)+13)

    #Draw it all!
    for entry in render:
        entry.draw(gameWindow)

    return render   #This later gets passed back into the function as "previous." It's like the circle of life or something. 

def endGame(winner = None):
    global plaWins
    global comWins

    #This just makes it a lot easier to reposition the victory banners. It's probably not that efficient, but we're dealing with incredibly simplistic functions anyway, so it's plenty fast.
    banner1 = Text(Point(153, 0), "")
    banner2 = Text(Point(153, 400), "")

    if winner == "X":
        plaWins += 1
        if twoPlayers:
            banner1.setText("PLAYER 1")
        else:
            banner1.setText("PLAYER")
        #Do victory animation for player
        banner2.setText("WINS!")
        banner1.setFill(color_rgb(0, 200, 0))
        banner2.setFill(color_rgb(0, 200, 0))
        banner1.setSize(30)
        banner2.setSize(36)
    elif winner == "O":
        comWins += 1
        if twoPlayers:
            banner1.setText("PLAYER 2")
        else:
            banner1.setText("COMPUTER")
        #Do victory animation for computer
        banner2.setText("WINS!")
        banner1.setFill(color_rgb(200, 0, 0))
        banner2.setFill(color_rgb(200, 0, 0))
        banner1.setSize(30)
        banner2.setSize(36)
    else:
        banner1.setText("NO")
        banner2.setText("CONTEST")
        banner1.setFill(color_rgb(100, 100, 100))
        banner2.setFill(color_rgb(100, 100, 100))
        banner1.setSize(36)
        banner2.setSize(30)

    #Dropped this code outside the 
    banner1.draw(gameWindow)
    banner2.draw(gameWindow)
    #This is just entirely guesswork. I took a stab at how long it needed to run, and it happened to work.
    for i in range(19):
        banner1.move(0, 7)
        banner2.move(0, -12)
        wait(0.05)
    wait(5)
    banner1.undraw()
    banner2.undraw()

    return True #No, it doesn't actually NEED to return anything, but it cuts down on a line or two inside checkBoard.

def reset(previous):
    #GEE, IT SURE IS GLOBAL VARIABLE AROUND HERE
    global gameWindow
    global board
    global remainingMoves
    global scoreText
    global buttonText
    global twoPlayers
    global plaWins
    global comWins
    #I JUST WONDER WHAT THIS FUNCTION IS UP TO.

    #EDIT: Moved player scores to reset function for simplicity.
    if twoPlayers:
        scoreText[0].setText("Player 1 Wins: "+str(plaWins))
        scoreText[1].setText("Player 2 Wins: "+str(comWins))
        buttonText[0].setText("Switch to 1P")
    else:
        scoreText[0].setText("Player Wins: "+str(plaWins))
        scoreText[1].setText("Computer Wins: "+str(comWins))
        buttonText[0].setText("Switch to 2P")

    previous = randomizeList(previous)  #This just makes for a slightly cooler board clearing animation.
    for entry in previous:
        entry.undraw()
        wait(0.1)
    board = [[None, None, None],[None, None, None],[None, None, None]]
    remainingMoves = 9

    return randrange(2) #Returns a randrange to determine next player. Yeah, I know. I know.

#This function is lazy, but that's because it's carefully controlled in how and where it's called.
#As such, it's useless elsewhere. :/ Note that it does indeed destroy its input. Whoops. :V
#It doesn't need to save that input though, so there's no reason to write it so it doesn't.
def randomizeList(inList):
    outList = []
    while len(inList) > 0:
        randomIndex = randrange(len(inList))
        outList.append(inList[randomIndex])
        inList.remove(inList[randomIndex])
    return outList

#...You'd think the actual script would be a little more complex. Oh well.
#Plus, this allows me to catch the only exception this thing is capable of
#throwing - exiting the game while things are still in progress.
try:
    main()
except:
    pass