# Program-Your-Own-Chess

## Purpose
Students will apply many of the concepts they've already learned in order to add on to my code and create a fully-functional chess game.

## Current Behavior of the Project
The user interface is already created. There is a board and 32 pieces. Feel free to replace the piece images with your own.

The white pieces go first and then the black pieces, and they continue to take turns.

The pieces can move anywhere right now. If the place they move to has a piece, that piece will be killed, even if it is the player's own piece.

## Instructions
Your job is to program the game logic that restricts pieces from making illegal moves. You will implement the canMove method for the King, Queen, Bishop, Knight, Rook, and Pawn classes. Here is what the Pawn's canMove method looks like:

```
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A pawn may only move towards the oponent's side of the board.
        // If the pawn has not moved yet in the game, for its first move it can 
        // move two spaces forward. Otherwise, it may only move one space. 
        // When not attacking it may only move straight ahead.
        // When attacking it may only move space diagonally forward

                // WRITE CODE HERE
        
                
                
        return true;
    }
```

That method will return true if the desired moved is allowed and false otherwise. You will need to use the following methods in order to complete this:

```
/**
 *  put in the x and y values representing a position on the board (0-7,0-7)
 *  and this method returns the piece that is at that position. If there 
 *  is no piece at that position, this method returns the null.) 
 */
Piece Board.getPiece(int x, int y) 

/**
 *  this method tells you what a specific piece's x value is on the board 
 *  (0 at the left, all the way to 7 at the right)
 */
int Piece.getX()

/**
 *  this method tells you what a specific piece's y value is on the board 
 *  (0 at the top, all the way to 7 at the bottom)
 */
int Piece.getY()

/**
 *  this method returns true if the piece is white and false otherwise
 */
boolean Piece.isWhite()

/**
 *  this method returns true if the piece is black and false otherwise
 */
boolean Piece.isBlack()
```
