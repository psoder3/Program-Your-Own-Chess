package chessgui.pieces;

public class Rook extends Piece {

    public Rook(int x, int y, boolean is_white, String file_path)
    {
        super(x,y,is_white,file_path);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A rook can move as many squares as he wants either forward,
        // backward, or sideways without jumping any pieces. He cannot attack
        // his own pieces.
        
                // WRITE CODE HERE
        
        
        return true;
    }
}
