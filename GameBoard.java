import java.util.Arrays;

public class GameBoard {

    private static final int baordDimentions = 10;
    private static final char[] BOARD_LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    private final String[][] board;
    private final String Water = "~";
    private static final String shipPlacement1 = "vertical";
    private static final String getShipPlacement2 = "Horizontal";
    private static Boolean ifWater = true;

    public GameBoard() {
        this.board = new String[baordDimentions][baordDimentions];
        for (int i = 0; i < baordDimentions; i++) {
            for (int j = 0; j < baordDimentions; j++) {
                board[i][j] = new String();
            }
        }
    }

    public void printBoard() {
        System.out.print("\t");
        for (int i = 0; i < baordDimentions; i++) {
            System.out.print((i) + "\t");
        }
        System.out.println();
        for (int i = 0; i < baordDimentions; i++) {
            System.out.print(BOARD_LETTERS[i] + "\t");
            for (int j = 0; j < baordDimentions; j++) {
                System.out.print(board[i][j] = Water + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*public Boolean IfWater() {
        for (int i = 0; i < baordDimentions; i++) {
            for (int j = 0; j < baordDimentions; j++) {
                if (board[i][j] == Water) ;
                {
                    return ifWater = true;
                }

            }

        }*/
        /*public void PlaceShip(int rowstart,int rowend, int colstart,int callend, Ship selectedShip) {
            if(ifWater){

            }

        }*/

}
