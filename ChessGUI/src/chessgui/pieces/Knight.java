package chessgui.pieces;

public class Knight extends Piece {

    public Knight(int x, int y, boolean is_white, String file_path)
    {
        super(x,y,is_white,file_path);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: a knight can move in any L shape and can jump over anyone
        // in order to do so. He cannot attack his own pieces.
            
                // WRITE CODE HERE
        
        
        return true;
    }
}
