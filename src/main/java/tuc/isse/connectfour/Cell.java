// Ali.Alipour@tu-clausthal.de
// Vorname: Ali
// Nachname: Alipour
// amirreza.jafari@tu-clausthal.de
// Vorname: Amirreza
// Nachname: Jafari

package tuc.isse.connectfour;

/**
 * Represents a single cell in the game board.
 * Each cell can either be empty or contain a token.
 * @author Amirreza Jafari (amirreza.jafari@tu-clausthal.de)
 * @author Ali Alipour (Ali.Alipour@tu-clausthal.de)
 */
public class Cell extends GameObject {
    private Token token;

    /**
     * Constructor for Cell.
     * Initializes the cell as empty.
     */
    public Cell() {
        this.token = null;
    }

    /**
     * Checks if the cell is empty.
     * @return True if empty, false otherwise
     */
    public boolean isEmpty() {
        return token == null;
    }

    /**
     * Assigns a token to this cell.
     * @param token The token to be placed
     */
    public void setToken(Token token) {
        this.token = token;
    }

    /**
     * Retrieves the token in this cell.
     * @return The token or null if empty
     */
    public Token getToken() {
        return token;
    }

    /**
     * Returns a string representation of the cell.
     * Returns "-" if empty, or the token's string (X or O) if occupied.
     * @return A string representing the cell
     */
    @Override
    public String toString() {
        return token == null ? "-" : token.toString();
    }
}