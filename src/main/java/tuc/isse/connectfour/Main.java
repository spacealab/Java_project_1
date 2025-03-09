// amirreza.jafari@tu-clausthal.de
// Vorname: Amirreza
// Nachname: Jafari
// Ali.Alipour@tu-clausthal.de
// Vorname: Ali
// Nachname: Alipour

package tuc.isse.connectfour;

/**
 * Main class to test the zigzag win condition for Vier Gewinnt (Projekt02).
 * @author Amirreza Jafari
 * @author Ali Alipour
 */
public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        // Test scenario 7 (zigzag pattern for player BLUE)
        board.dropToken(Color.BLUE, 3); // grid[5][3] = O
        board.dropToken(Color.BLUE, 2); // grid[5][2] = O
        board.dropToken(Color.BLUE, 4); // grid[5][4] = O
        board.dropToken(Color.BLUE, 3); // grid[4][3] = O
        board.dropToken(Color.BLUE, 2); // grid[4][2] = O
        board.dropToken(Color.BLUE, 4); // grid[4][4] = O
        board.dropToken(Color.BLUE, 3); // grid[3][3] = O

        // Print board
        System.out.println(board.toString());

        // Check win condition
        if (board.checkWin()) {
            System.out.println("Player BLUE wins with zigzag pattern!");
        } else {
            System.out.println("No zigzag pattern found.");
        }

        // Additional test (Scenario 1 - vertical, should NOT win)
        Board board2 = new Board();
        board2.dropToken(Color.BLUE, 0); // grid[5][0]
        board2.dropToken(Color.BLUE, 0); // grid[4][0]
        board2.dropToken(Color.BLUE, 0); // grid[3][0]
        board2.dropToken(Color.BLUE, 0); // grid[2][0]
        System.out.println("\nScenario 1 (vertical):");
        System.out.println(board2.toString());
        System.out.println("Win? " + board2.checkWin());
    }
}