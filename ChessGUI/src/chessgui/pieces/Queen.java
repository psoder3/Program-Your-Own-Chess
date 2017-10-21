package chessgui.pieces;

public class Queen extends Piece {

    public Queen(int x, int y, boolean is_white, String file_path)
    {
        super(x,y,is_white,file_path);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        // Remember: A Queen can move as many squares as she wants forward, 
        // backward, sideways, or diagonally, without jumping over any pieces.
        // She cannot attack her own pieces.
        
                // WRITE CODE HERE

        
        return true;
    }
}
