package chessgui.pieces;

import chessgui.Board;

public class King extends Piece {

    public King(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: a king can move one square up, right, left, or down, or
        // diagonally, but he can never put himself in danger of an oposing 
        // piece attacking him on the next turn. He cannot attack his own pieces.
        
                // WRITE CODE HERE

        
        return true;
    }
}
