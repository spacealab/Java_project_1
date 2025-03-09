// Ali.Alipour@tu-clausthal.de
// Vorname: Ali
// Nachname: Alipour
// amirreza.jafari@tu-clausthal.de
// Vorname: Amirreza
// Nachname: Jafari

package tuc.isse.connectfour;

/**
 * Represents the game board for "Vier Gewinnt".
 * The board consists of 6 rows and 7 columns.
 * @author Amirreza Jafari
 * @author Ali Alipour
 */
public class Board extends GameObject {
    private final int ROWS = 6;
    private final int COLUMNS = 7;
    private Cell[][] grid;

    /**
     * Constructs a new empty game board with a 7x6 grid.
     * Initializes all cells as empty.
     */
    public Board() {
        grid = new Cell[ROWS][COLUMNS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                grid[row][col] = new Cell();
            }
        }
    }

    /**
     * Drops a token of the specified color into the given column.
     * The token is placed in the lowest empty cell of the column.
     * @param color The color of the token (RED or BLUE)
     * @param columnIndex The column where the token is dropped
     * @return true if the token was dropped successfully, false otherwise
     */
    public boolean dropToken(Color color, int columnIndex) {
        if (!canDrop(columnIndex)) {
            return false;
        }
        for (int row = ROWS - 1; row >= 0; row--) {
            if (grid[row][columnIndex].isEmpty()) {
                grid[row][columnIndex].setToken(new Token(color)); // استفاده از Color درست
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a token can be dropped in the specified column.
     * @param columnIndex The column to check
     * @return true if there is space in the column, false otherwise
     */
    public boolean canDrop(int columnIndex) {
        if (columnIndex < 0 || columnIndex >= COLUMNS) {
            return false;
        }
        return grid[0][columnIndex].isEmpty();
    }

    /**
     * Returns a string representation of the game board.
     * Displays tokens as X (RED) or O (BLUE), and empty cells as -, separated by |.
     * @return A string showing the current state of the board
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                sb.append("|");
                sb.append(grid[row][col].toString());
            }
            sb.append("|\n");
        }
        return sb.toString();
    }

    /**
     * Checks if a player has won by forming a zigzag pattern with 4 tokens.
     * The zigzag pattern is defined as:
     * - Start at grid[row][col]
     * - Next at grid[row-1][col-1] (up and left)
     * - Next at grid[row-1][col+1] (same row, two columns to the right)
     * - Next at grid[row-2][col] (up and back to the original column)
     * @return true if a zigzag pattern is found, false otherwise
     */
    public boolean checkWin() {
        for (int row = ROWS - 1; row >= 2; row--) {
            for (int col = 1; col < COLUMNS - 1; col++) {
                if (!grid[row][col].isEmpty()) {
                    Color color = grid[row][col].getToken().getColor(); // نوع Color درست
                    if (row - 1 >= 0 && col - 1 >= 0 && !grid[row-1][col-1].isEmpty() &&
                        grid[row-1][col-1].getToken().getColor() == color) {
                        if (col + 1 < COLUMNS && !grid[row-1][col+1].isEmpty() &&
                            grid[row-1][col+1].getToken().getColor() == color) {
                            if (row - 2 >= 0 && !grid[row-2][col].isEmpty() &&
                                grid[row-2][col].getToken().getColor() == color) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}