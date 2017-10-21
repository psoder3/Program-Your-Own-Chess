package chessgui;

/**
 *
 * @author Paul Soderquist
 */
public class ChessGUI {
    
    public BoardFrame boardframe;
    public static void main(String[] args) {
        ChessGUI gui = new ChessGUI();
        gui.boardframe = new BoardFrame();
        gui.boardframe.setVisible(true);
        
    }
}
