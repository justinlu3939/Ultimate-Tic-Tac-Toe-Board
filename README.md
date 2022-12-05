# **Ultimate Tic Tac Toe Board Game**
## _Justin Lu, JJL200014, CS 2336.001, Professor Mehra Borazjany_
***
***
#### _Table of Contents_
1. Game Summary
2. Instructions
3. Program functions
4. Completion and Bugs
5. Learning experience
6. What I would do differently next time
7. Conclusion
***
***
## _Game Summary_
Ultimate Tic Tac Toe is a Java game that was made in Eclipse IDE. It involves 9 connected tic tac toe boards. When a token is placed on a board, the next player will have to play on the board that corresponds with the previous move. Each board is won when a player makes a consecutive line of 3 tokens either vertically, horizontally or diagonally. Once a board has a declared winner, the other player cannot win that board even though they also technically won the board. In order to win the game, the players/computers must win three boards vertically, horizontally or diagonally on the ultimate tic tac toe board game by playing in the individual tic tac toe boards.
***
## _Instructions_
The game would first prompt the user(s) for a gamemode choice: Player versus Player, Player versus AI and AI versus AI. Regardless of the choice, there will always be two player objects instantiated. In the beginning, it will ask the first player to choose a board to begin at. For each player, the program will ask the player for a position on the current board to place a token. If the position is already taken or doesn't exists, the player would be asked for another position. If the board that the next player will have to play on is full, the next player would get to pick a new board to play on. The process continues until a winner is decided or there is a tie.
***
## _Program functions_
_The Ultimate Board Class [ultimateBoard] -_
1. ultimateBoard() constructor initializes the ultimate board 2D array of board objects and the two player objects.
2. printAll() function prints out all the boards and their contents in the Ultimate Tic Tac Toe Board format.
3. findBoard(int) function takes the user input and translate it to coordinates on the Ultimate board to find the board and then return it.
4. ultimateWinner() function takes the winners for all the boards and check to see if there is a winner for the game.
5. returnBoardNumber(int, int) function translates the two integers (row and col) into a board number and returns the board number.
6. startPVP() function is called when the user picks Player versus Player and will ask the players for board numbers and positions.
7. startPVE() function is called when the user picks Player versus AI and will ask the player for board numbers and positions while the AI will act as the second player and place random numbers between 0 - 9 for positions.
8. startEVE() function is called when the user picks AI versus AI and both AI will place tokens on the boards randomly (0 - 9) until there is a winner or the board is full (there will be no user input).

_The Board class [board] -_
1. board() constructor initializes the 2D array of characters ("-") and the default winner ("-").
2. returnBoard() function returns the address of the board.
3. checkBox(int) function translates the user input into coordinates on the 2D array and checks whether that spot is empty or not, returning true if it is indeed empty.
4. checkBoardX() function checks if Player X has won the board, returning true if Player X won.
5. checkBoardO() function checks if Player O has won the board, returning true if Player O won.
6. isFull() function checks if the board is full or not, returning true if the board is indeed full.
7. placeToken(int, char) function translates the user input (int) into coordinates for the 2D array board before placing the character input (char) into the coordinate.

_The Player class [Player] -_
1. Player() constructor initializes the default token ("-").

_The Player X class extends Player [PlayerX] -_
1. PlayerX() constructor overrides the Player() constructor and initializes the token ("X").

_The Player O class extends Player [PlayerO] -_
1. PlayerO() constructor overrides the Player() constructor and initializes the token ("O").

_The Main class [main] -_
1. main(String[]) constructor creates the ultimateBoard object and asks the user for the gamemode choice.
***

## _Completion and Bugs_
The program is able to run the code properly and produce desired results. It has been tested with numerous edge cases including invalid input for both board numbers and positions on the board. There are no known bugs in the game. But it is advised to enter the proper type of input as the program will throw an exception otherwise. Besides that, the game will be able to handle any user input and run accordingly.
***

## _Learning Experience_
While planning and designing the game, I had to implement many classes and functions and combining them in the ultimateBoard class, helping me value the importance of organization. The project also furthered my knowledge in topics such as inheritance and switch cases. Last of all, the project required proper planning and time management which helped me with UML diagram designs and scheduling.
***

## _What I would do differently next time_
If I had the chance to go back and make improvements to the game, the two functions/code blocks I would change would be the printAll function and the code block that prints out the board winners.

1. printAll() - the following code snippet is part of the block of code that prints out the ultimate tic tac toe board. The code is extremely clustered and could be improved by having a for loop and nested for loop to limit the number of lines in the program.
```
System.out.print("Board 0: | " + boardArray[0][0].returnBoard()[0][0] + " | " + boardArray[0][0].returnBoard()[0][1] + " | " + boardArray[0][0].returnBoard()[0][2] + " | ");

System.out.print("Board 1: | " + boardArray[0][1].returnBoard()[0][0] + " | " + boardArray[0][1].returnBoard()[0][1] + " | " + boardArray[0][1].returnBoard()[0][2] + " | ");

System.out.print("Board 2: | " + boardArray[0][2].returnBoard()[0][0] + " | " + boardArray[0][2].returnBoard()[0][1] + " | " + boardArray[0][2].returnBoard()[0][2] + " |\n");
```

2. board winner code block - the following for loop checks each of the boards in the 2D array and prints out the winner for each if there is any. An improvement for this would be to have an individual function with the code so that the program could just call the function everytime instead of just creating a for loop everytime.
```
for(int i = 0; i < 3; i++)
{
	for(int j = 0; j < 3; j++)
	{
		if(boardArray[i][j].checkBoardX() == 1)
		{
			System.out.println("Player X has won Board " + returnBoardNumber(i, j));
		}
		if(boardArray[i][j].checkBoardO() == 2)
		{
			System.out.println("Player O has won Board " + returnBoardNumber(i, j));
		}
	}
}
```
***
## _Conclusion_
Overall, the project is successful in producing a working game and valid results. There are definetly improvements that can made to the code to improve efficiency and reduce the number of lines. However, the game runs properly, only lacking try and catch expections for invalid types of input. I learned a lot from the experience and had a lot of fun coming up with ideas on how to make the game. I hope you had as much fun playing the game as I had finsihing the project.
