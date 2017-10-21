package chessgui.pieces;

public class Bishop extends Piece {

    public Bishop(int x, int y, boolean is_white, String file_path)
    {
        super(x,y,is_white,file_path);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: For attacking or just moving, a bishop is allowed to move 
        // as many squares diagonally as it wants without jumping over another 
        // piece. He cannot attack his own pieces.
        
                // WRITE CODE HERE

        
        return true;
    }
}
