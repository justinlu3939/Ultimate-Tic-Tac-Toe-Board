//Justin Lu; CS 2336.001; Professor Borazjany 

/*
 * Analysis and Design
 * The Ultimate TTT board game is a tic tac toe board game of tic tac toe boards.
 * The only way you can win, is by winning three boards in a row, column or a
 * diagonal line. For my code, I decided to create the board using a 2D array
 * . The 2D array will contain the board objects. I will also use do while loops
 * to get the user input. I would also implement a checkBoard, checkBox and 
 * checkFull function in the board class in order to check each board. There 
 * will also be two Player classes that will have a different token (X and O). 
 * The players will be asked to enter a position on the board and their 
 * respective tokent will be placed after determining whether the positon and 
 * board is valid. 
 */

import java.util.Scanner;
class ultimateBoard
{
	//create the main objects
	board[][] boardArray;
	PlayerX x;
	PlayerO o;

	ultimateBoard()
	{
		//creating the array of boards
		boardArray = new board[3][3];
		boardArray[0][0] = new board(); //board 0
		boardArray[0][1] = new board(); //board 1
		boardArray[0][2] = new board(); //board 2
		boardArray[1][0] = new board(); //board 3
		boardArray[1][1] = new board(); //board 4
		boardArray[1][2] = new board(); //board 5
		boardArray[2][0] = new board(); //board 6
		boardArray[2][1] = new board(); //board 7
		boardArray[2][2] = new board(); //board 8
		
		//create the players
		x = new PlayerX();
		o = new PlayerO();
	}
	public void printAll()
	{
		//print out boards (0 - 8) in a grid
		//alternative: create a for loop of 9 or two for loops of 3
		System.out.print("Board 0: | " + boardArray[0][0].returnBoard()[0][0] + " | " + boardArray[0][0].returnBoard()[0][1] + " | " + boardArray[0][0].returnBoard()[0][2] + " | ");
		System.out.print("Board 1: | " + boardArray[0][1].returnBoard()[0][0] + " | " + boardArray[0][1].returnBoard()[0][1] + " | " + boardArray[0][1].returnBoard()[0][2] + " | ");
		System.out.print("Board 2: | " + boardArray[0][2].returnBoard()[0][0] + " | " + boardArray[0][2].returnBoard()[0][1] + " | " + boardArray[0][2].returnBoard()[0][2] + " |\n");
		
		System.out.print("         | " + boardArray[0][0].returnBoard()[1][0] + " | " + boardArray[0][0].returnBoard()[1][1] + " | " + boardArray[0][0].returnBoard()[1][2] + " | ");
		System.out.print("         | " + boardArray[0][1].returnBoard()[1][0] + " | " + boardArray[0][1].returnBoard()[1][1] + " | " + boardArray[0][1].returnBoard()[1][2] + " | ");
		System.out.print("         | " + boardArray[0][2].returnBoard()[1][0] + " | " + boardArray[0][2].returnBoard()[1][1] + " | " + boardArray[0][2].returnBoard()[1][2] + " |\n");
		
		System.out.print("         | " + boardArray[0][0].returnBoard()[2][0] + " | " + boardArray[0][0].returnBoard()[2][1] + " | " + boardArray[0][0].returnBoard()[2][2] + " | ");
		System.out.print("         | " + boardArray[0][1].returnBoard()[2][0] + " | " + boardArray[0][1].returnBoard()[2][1] + " | " + boardArray[0][1].returnBoard()[2][2] + " | ");
		System.out.print("         | " + boardArray[0][2].returnBoard()[2][0] + " | " + boardArray[0][2].returnBoard()[2][1] + " | " + boardArray[0][2].returnBoard()[2][2] + " |\n");
		
		System.out.print("Board 3: | " + boardArray[1][0].returnBoard()[0][0] + " | " + boardArray[1][0].returnBoard()[0][1] + " | " + boardArray[1][0].returnBoard()[0][2] + " | ");
		System.out.print("Board 4: | " + boardArray[1][1].returnBoard()[0][0] + " | " + boardArray[1][1].returnBoard()[0][1] + " | " + boardArray[1][1].returnBoard()[0][2] + " | ");
		System.out.print("Board 5: | " + boardArray[1][2].returnBoard()[0][0] + " | " + boardArray[1][2].returnBoard()[0][1] + " | " + boardArray[1][2].returnBoard()[0][2] + " |\n");
		
		System.out.print("         | " + boardArray[1][0].returnBoard()[1][0] + " | " + boardArray[1][0].returnBoard()[1][1] + " | " + boardArray[1][0].returnBoard()[1][2] + " | ");
		System.out.print("         | " + boardArray[1][1].returnBoard()[1][0] + " | " + boardArray[1][1].returnBoard()[1][1] + " | " + boardArray[1][1].returnBoard()[1][2] + " | ");
		System.out.print("         | " + boardArray[1][2].returnBoard()[1][0] + " | " + boardArray[1][2].returnBoard()[1][1] + " | " + boardArray[1][2].returnBoard()[1][2] + " |\n");
		
		System.out.print("         | " + boardArray[1][0].returnBoard()[2][0] + " | " + boardArray[1][0].returnBoard()[2][1] + " | " + boardArray[1][0].returnBoard()[2][2] + " | ");
		System.out.print("         | " + boardArray[1][1].returnBoard()[2][0] + " | " + boardArray[1][1].returnBoard()[2][1] + " | " + boardArray[1][1].returnBoard()[2][2] + " | ");
		System.out.print("         | " + boardArray[1][2].returnBoard()[2][0] + " | " + boardArray[1][2].returnBoard()[2][1] + " | " + boardArray[1][2].returnBoard()[2][2] + " |\n");
		
		System.out.print("Board 6: | " + boardArray[2][0].returnBoard()[0][0] + " | " + boardArray[2][0].returnBoard()[0][1] + " | " + boardArray[2][0].returnBoard()[0][2] + " | ");
		System.out.print("Board 7: | " + boardArray[2][1].returnBoard()[0][0] + " | " + boardArray[2][1].returnBoard()[0][1] + " | " + boardArray[2][1].returnBoard()[0][2] + " | ");
		System.out.print("Board 8: | " + boardArray[2][2].returnBoard()[0][0] + " | " + boardArray[2][2].returnBoard()[0][1] + " | " + boardArray[2][2].returnBoard()[0][2] + " | \n");
		
		System.out.print("         | " + boardArray[2][0].returnBoard()[1][0] + " | " + boardArray[2][0].returnBoard()[1][1] + " | " + boardArray[2][0].returnBoard()[1][2] + " | ");
		System.out.print("         | " + boardArray[2][1].returnBoard()[1][0] + " | " + boardArray[2][1].returnBoard()[1][1] + " | " + boardArray[2][1].returnBoard()[1][2] + " | ");
		System.out.print("         | " + boardArray[2][2].returnBoard()[1][0] + " | " + boardArray[2][2].returnBoard()[1][1] + " | " + boardArray[2][2].returnBoard()[1][2] + " |\n");
		
		System.out.print("         | " + boardArray[2][0].returnBoard()[2][0] + " | " + boardArray[2][0].returnBoard()[2][1] + " | " + boardArray[2][0].returnBoard()[2][2] + " | ");
		System.out.print("         | " + boardArray[2][1].returnBoard()[2][0] + " | " + boardArray[2][1].returnBoard()[2][1] + " | " + boardArray[2][1].returnBoard()[2][2] + " | ");
		System.out.print("         | " + boardArray[2][2].returnBoard()[2][0] + " | " + boardArray[2][2].returnBoard()[2][1] + " | " + boardArray[2][2].returnBoard()[2][2] + " |\n");
	}
	public board findBoard(int num) //returns the address of the boards
	{
		//the num will be what the user inputs so from 0 - 8
		//therefore, it will need to converted to the row and col formal first
		switch(num)
		{
		case 0:
			return boardArray[0][0];
		case 1:
			return boardArray[0][1];
		case 2:
			return boardArray[0][2];
		case 3:
			return boardArray[1][0];
		case 4:
			return boardArray[1][1];
		case 5:
			return boardArray[1][2];
		case 6:
			return boardArray[2][0];
		case 7:
			return boardArray[2][1];
		case 8:
			return boardArray[2][2];
		default:
			return null;
		}
	}
	public int ultimateWinner() //checks if the array for the winner
	{
		if((findBoard(0).checkBoardX() == 1 && findBoard(1).checkBoardX() == 1 && findBoard(2).checkBoardX() == 1) ||
		   (findBoard(3).checkBoardX() == 1 && findBoard(4).checkBoardX() == 1 && findBoard(5).checkBoardX() == 1) ||
		   (findBoard(6).checkBoardX() == 1 && findBoard(7).checkBoardX() == 1 && findBoard(8).checkBoardX() == 1) ||
		   (findBoard(0).checkBoardX() == 1 && findBoard(3).checkBoardX() == 1 && findBoard(6).checkBoardX() == 1) ||
		   (findBoard(1).checkBoardX() == 1 && findBoard(4).checkBoardX() == 1 && findBoard(7).checkBoardX() == 1) ||
		   (findBoard(2).checkBoardX() == 1 && findBoard(5).checkBoardX() == 1 && findBoard(8).checkBoardX() == 1) ||
		   (findBoard(0).checkBoardX() == 1 && findBoard(4).checkBoardX() == 1 && findBoard(8).checkBoardX() == 1) ||
		   (findBoard(6).checkBoardX() == 1 && findBoard(4).checkBoardX() == 1 && findBoard(2).checkBoardX() == 1))
		{
			return 1;
		}
		else if((findBoard(0).checkBoardO() == 2 && findBoard(1).checkBoardO() == 2 && findBoard(2).checkBoardO() == 2) ||
				(findBoard(3).checkBoardO() == 2 && findBoard(4).checkBoardO() == 2 && findBoard(5).checkBoardO() == 2) ||
				(findBoard(6).checkBoardO() == 2 && findBoard(7).checkBoardO() == 2 && findBoard(8).checkBoardO() == 2) ||
				(findBoard(0).checkBoardO() == 2 && findBoard(3).checkBoardO() == 2 && findBoard(6).checkBoardO() == 2) ||
				(findBoard(1).checkBoardO() == 2 && findBoard(4).checkBoardO() == 2 && findBoard(7).checkBoardO() == 2) ||
				(findBoard(2).checkBoardO() == 2 && findBoard(5).checkBoardO() == 2 && findBoard(8).checkBoardO() == 2) ||
				(findBoard(0).checkBoardO() == 2 && findBoard(4).checkBoardO() == 2 && findBoard(8).checkBoardO() == 2) ||
				(findBoard(6).checkBoardO() == 2 && findBoard(4).checkBoardO() == 2 && findBoard(2).checkBoardO() == 2))
		{
			return 2;
		}
		//else if statement that tests if every board is full
		else if(boardArray[0][0].isFull() && boardArray[0][1].isFull() && boardArray[0][2].isFull() &&
				boardArray[1][0].isFull() && boardArray[1][1].isFull() && boardArray[1][2].isFull() &&
				boardArray[2][0].isFull() && boardArray[2][1].isFull() && boardArray[2][2].isFull())
		{
			return 3;
		}
		return 0;
	}
	public int returnBoardNumber(int row, int col)
	{
		//switch case probably cannot take two numbers
		if(row == 0 && col == 0)
		{
			return 0;
		}
		else if(row == 0 && col == 1)
		{
			return 1;
		}
		else if(row == 0 && col == 2)
		{
			return 2;
		}
		else if(row == 1 && col == 0)
		{
			return 3;
		}
		else if(row == 1 && col == 1)
		{
			return 4;
		}
		else if(row == 1 && col == 2)
		{
			return 5;
		}
		else if(row == 2 && col == 0)
		{
			return 6;
		}
		else if(row == 2 && col == 1)
		{
			return 7;
		}
		else if(row == 2 && col == 2)
		{
			return 8;
		}
		return -1;
	}
	public void startPVP() //board update issue is checkBoard function and that char winner isn't saving data
	{
		printAll();
		Scanner in = new Scanner(System.in);
		System.out.print("Choose a board (0 - 8): ");
		int boardNum = in.nextInt();
		int position = 0;
		do
		{
			while(findBoard(boardNum) == null || findBoard(boardNum).isFull()) //if the board doesn't exist or is full
			{
				System.out.println("Board not available. Try again.");
				System.out.print("Player X, choose a board (0 - 8): ");
				boardNum = in.nextInt();
			}
			while(true) //if the board exists
			{
				System.out.println("Current Board = " + boardNum);
				System.out.print("Player X, Enter position (0 - 8): ");
				position = in.nextInt();
				if(findBoard(boardNum).checkBox(position)) //if the position is open
				{
					findBoard(boardNum).placeToken(position, x.token());
					boardNum = position;
				}
				else //if the position is not open
				{
					while(true)
					{
						System.out.println("Invalid position! Try Again.\nEnter position: ");
						position = in.nextInt();
						if(findBoard(boardNum).checkBox(position))
						{
							findBoard(boardNum).placeToken(position, x.token());
							boardNum = position;
							break;
						}
					}
				}
				break;
			}
			printAll();
			//this will print which boards are won and by who
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
			if(ultimateWinner() == 1) //early break so that Player O will not be asked
			{
				break;
			}
			
			while(findBoard(boardNum) == null || findBoard(boardNum).isFull()) //if the board doesn't exist
			{
				System.out.println("Board not available. Try again.");
				System.out.print("Player O, choose a board (0 - 8): ");
				boardNum = in.nextInt();
			}
			while(true) //if the board exists
			{
				System.out.println("Current Board = " + boardNum);
				System.out.print("Player O, Enter position (0 - 8): ");
				position = in.nextInt();
				if(findBoard(boardNum).checkBox(position)) //if the position is open
				{
					findBoard(boardNum).placeToken(position, o.token());
					boardNum = position;
				}
				else //if the position is not open
				{
					while(true)
					{
						System.out.println("Invalid position! Try Again.\nEnter position: ");
						position = in.nextInt();
						if(findBoard(boardNum).checkBox(position))
						{
							findBoard(boardNum).placeToken(position, o.token());
							boardNum = position;
							break;
						}
					}
				}
				break;
			}
			printAll();
			//this will print which boards are won and by who
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
		}
		while(ultimateWinner() == 0); //condition: if there are no winners yet
		
		if(ultimateWinner() == 1)
		{
			System.out.println("Player X has won!!!");
		}
		else if(ultimateWinner() == 2)
		{
			System.out.println("Player O has won!!!");
		}
		else if(ultimateWinner() == 3)
		{
			System.out.println("No winners. Tie.");
		}
	}
	public void startPVE()
	{
		//this game mode will be between the player and the random number generator
		printAll();
		Scanner in = new Scanner(System.in);
		System.out.print("Choose a board (0 - 8): ");
		int boardNum = in.nextInt();
		int position = 0;
		do
		{
			while(findBoard(boardNum) == null || findBoard(boardNum).isFull()) //if the board doesn't exist or is full
			{
				System.out.println("Board not available. Try again.");
				System.out.print("Player X, choose a board (0 - 8): ");
				boardNum = in.nextInt();
			}
			while(true) //if the board exists
			{
				System.out.println("Current Board: " + boardNum);
				System.out.print("Player X, Enter position (0 - 8): ");
				position = in.nextInt();
				if(findBoard(boardNum).checkBox(position)) //if the position is open
				{
					findBoard(boardNum).placeToken(position, x.token());
					boardNum = position;
				}
				else //if the position is not open
				{
					while(true)
					{
						System.out.println("Invalid position! Try Again.\nEnter position: ");
						position = in.nextInt();
						if(findBoard(boardNum).checkBox(position))
						{
							findBoard(boardNum).placeToken(position, x.token());
							boardNum = position;
							break;
						}
					}
				}
				break;
			}
			printAll();
			//this will print which boards are won and by who
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
						System.out.println("Computer O has won Board " + returnBoardNumber(i, j));
					}
				}
			}
			if(ultimateWinner() == 1) //early break if Player X has already won
			{
				break;
			}
			//because it is a computer, there is no need to ask for input
			System.out.println("\nComputer O Turn: ");
			while(findBoard(boardNum) == null || findBoard(boardNum).isFull()) //if the board doesn't exist
			{
				boardNum = (int)(Math.random()*9);
			}
			while(true) //if the board exists
			{
				position = (int)(Math.random()*9);
				if(findBoard(boardNum).checkBox(position)) //if the position is open
				{
					findBoard(boardNum).placeToken(position, o.token());
					boardNum = position;
				}
				else //if the position is not open
				{
					while(true)
					{
						position = (int)(Math.random()*9);
						if(findBoard(boardNum).checkBox(position))
						{
							findBoard(boardNum).placeToken(position, o.token());
							boardNum = position;
							break;
						}
					}
				}
				break;
			}
			printAll();
			//this will print which boards are won and by who
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
						System.out.println("Computer O has won Board " + returnBoardNumber(i, j));
					}
				}
			}
		}
		while(ultimateWinner() == 0); //condition if there are no winners
		
		if(ultimateWinner() == 1)
		{
			System.out.println("Player X has won!!!");
		}
		else if(ultimateWinner() == 2)
		{
			System.out.println("Computer O has won!!!");
		}
		else if(ultimateWinner() == 3)
		{
			System.out.println("No winners. Tie.");
		}
	}
	public void startEVE()
	{
		//this game mode is where it is random number generator vs random number generator
		//therefore, there will be no need to ask for input and possible no need to print out every action done by the AI
		int boardNum = (int)(Math.random()*9);;
		int position = 0;
		do
		{
			while(findBoard(boardNum) == null || findBoard(boardNum).isFull()) //if the board doesn't exist or is full
			{
				boardNum = (int)(Math.random()*9);
			}
			while(true) //if the board exists
			{
				position = (int)(Math.random()*9);
				if(findBoard(boardNum).checkBox(position)) //if the position is open
				{
					findBoard(boardNum).placeToken(position, x.token());
					boardNum = position;
				}
				else //if the position is not open
				{
					while(true) //keeps getting a new position until a position is valid
					{
						position = (int)(Math.random()*9);
						if(findBoard(boardNum).checkBox(position))
						{
							findBoard(boardNum).placeToken(position, x.token());
							boardNum = position;
							break;
						}
					}
				}
				break;
			}
			if(ultimateWinner() == 1) //early break for Computer X win
			{
				break;
			}

			while(findBoard(boardNum) == null || findBoard(boardNum).isFull()) //if the board doesn't exist
			{
				boardNum = (int)(Math.random()*9);
			}
			while(true) //if the board exists
			{
				position = (int)(Math.random()*9);
				if(findBoard(boardNum).checkBox(position)) //if the position is open
				{
					findBoard(boardNum).placeToken(position, o.token());
					boardNum = position;
				}
				else //if the position is not open
				{
					while(true)
					{
						position = (int)(Math.random()*9);
						if(findBoard(boardNum).checkBox(position))
						{
							findBoard(boardNum).placeToken(position, o.token());
							boardNum = position;
							break;
						}
					}
				}
				break;
			}
		}
		while(ultimateWinner() == 0); //condition of no winners yet
		printAll();
		
		if(ultimateWinner() == 1)
		{
			System.out.println("Computer X has won!!!");
		}
		else if(ultimateWinner() == 2)
		{
			System.out.println("Computer O has won!!!");
		}
		else if(ultimateWinner() == 3)
		{
			System.out.println("No winners. Tie.");
		}
	}
}
class board
{
	char[][] newBoard;
	char winner;
	board() //create the board TTT board
	{
        newBoard = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'},
        };
        winner = '-';
	}
	public char[][] returnBoard()
	{
		//return the address of the board
		return newBoard;
	}
	public boolean checkBox(int num)
	{
		int row = 0;
		int col = 0;
		//finds the position in the board using the user input
		//user input would be between 0 - 8 so it will need to be converted to row and col first
		switch(num)
		{
		case 0:
			row = 0;
			col = 0;
			break;
		case 1:
			row = 0;
			col = 1;
			break;
		case 2:
			row = 0;
			col = 2;
			break;
		case 3:
			row = 1;
			col = 0;
			break;
		case 4:
			row = 1;
			col = 1;
			break;
		case 5:
			row = 1;
			col = 2;
			break;
		case 6:
			row = 2;
			col = 0;
			break;
		case 7:
			row = 2;
			col = 1;
			break;
		case 8:
			row = 2;
			col = 2;
			break;
		default:
			//the position doesn't even exist
			return false;
		}
		if(newBoard[row][col] != '-')
		{
			return false; //if the space is not empty
		}
		return true; //if the space is empty
	}
	public int checkBoardX() //this method will check the board if X has won the board
	{
		if((newBoard[0][0] == 'X' && newBoard[0][1] == 'X' && newBoard[0][2] == 'X') ||
		           (newBoard[1][0] == 'X' && newBoard[1][1] == 'X' && newBoard[1][2] == 'X') ||
		           (newBoard[2][0] == 'X' && newBoard[2][1] == 'X' && newBoard[2][2] == 'X') ||
		           (newBoard[0][0] == 'X' && newBoard[1][1] == 'X' && newBoard[2][2] == 'X') ||
		           (newBoard[0][2] == 'X' && newBoard[1][1] == 'X' && newBoard[2][0] == 'X') ||
		           (newBoard[0][0] == 'X' && newBoard[1][0] == 'X' && newBoard[2][0] == 'X') ||
		           (newBoard[0][1] == 'X' && newBoard[1][1] == 'X' && newBoard[2][1] == 'X') ||
		           (newBoard[0][2] == 'X' && newBoard[1][2] == 'X' && newBoard[2][2] == 'X'))
		{
			if(winner == '-' || winner == 'X')
			{
				winner = 'X';
				return 1;
			}
			//if playerX won
		}
	    return 0; //if there are no winners
	}
	public int checkBoardO() //this method will check the board if O has won the board
	{
		if((newBoard[0][0] == 'O' && newBoard[0][1] == 'O' && newBoard[0][2] == 'O') ||
	           (newBoard[1][0] == 'O' && newBoard[1][1] == 'O' && newBoard[1][2] == 'O') ||
	           (newBoard[2][0] == 'O' && newBoard[2][1] == 'O' && newBoard[2][2] == 'O') ||
	           (newBoard[0][0] == 'O' && newBoard[1][1] == 'O' && newBoard[2][2] == 'O') ||
	           (newBoard[0][2] == 'O' && newBoard[1][1] == 'O' && newBoard[2][0] == 'O') ||
	           (newBoard[0][0] == 'O' && newBoard[1][0] == 'O' && newBoard[2][0] == 'O') ||
	           (newBoard[0][1] == 'O' && newBoard[1][1] == 'O' && newBoard[2][1] == 'O') ||
	           (newBoard[0][2] == 'O' && newBoard[1][2] == 'O' && newBoard[2][2] == 'O'))
    	{
    		if(winner == '-' || winner == 'O')
    		{
    			winner = 'O';
    			return 2;
    		}
    		//if playerO won
    	}
    	return 0; //if there are no winners
	}
	public boolean isFull()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(newBoard[i][j] == '-')
				{
					return false; //if there is a blank space
				}
			}
		}
		return true; //if every space is filled with X or O
	}
	public void placeToken(int num, char token)
	{
		int row = 0;
		int col = 0;
		//finds the position on the board based on the integer
		//num must be converted to row and col format
		switch(num)
		{
		case 0:
			row = 0;
			col = 0;
			break;
		case 1:
			row = 0;
			col = 1;
			break;
		case 2:
			row = 0;
			col = 2;
			break;
		case 3:
			row = 1;
			col = 0;
			break;
		case 4:
			row = 1;
			col = 1;
			break;
		case 5:
			row = 1;
			col = 2;
			break;
		case 6:
			row = 2;
			col = 0;
			break;
		case 7:
			row = 2;
			col = 1;
			break;
		case 8:
			row = 2;
			col = 2;
			break;
		default:
			//the position doesn't even exist
			return;
		}
		newBoard[row][col] = token;
	}
}
//create the parent class, Player
//PlayerX and PlayerO will inherit the variables from this class
class Player
{
	char token;
	Player()
	{
		token = '-';
	}
}
//the Player/Computer X class that extends Player
class PlayerX extends Player
{
	PlayerX()
	{
		token = 'X';
	}
	public char token()
	{
		return token;
	}
}
//the Player/Computer O class that extends Player
class PlayerO extends Player
{
	PlayerO()
	{
		token = 'O';
	}
	public char token()
	{
		return token;
	}
}
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//introducing the game
		System.out.println("Welcome to Ultimate Tic Tac Toe!!!");
		//ask the user for a gameplay
		System.out.println("Choose a gameplay (1 - Player v Player) (2 - Player v AI) (3 - AI v AI): ");
		int choice = input.nextInt();
		ultimateBoard theGame = new ultimateBoard();
		
		if(choice == 1) //Player vs Player
		{
			theGame.startPVP();
			System.out.println("Thank you for playing the game! Please play again!");
		}
		else if(choice == 2) //Player vs AI
		{
			theGame.startPVE();
			System.out.println("Thank you for playing the game! Please play again!");
		}
		else if(choice == 3) //AI vs AI
		{
			theGame.startEVE();
			System.out.println("Thank you for playing the game! Please play again!");
		}
		else //in case the user enters a number or symbol that is not 1-3
		{
			System.out.println("Not a valid gamemode. Please try again");
		}
	}

}
