// amirreza.jafari@tu-clausthal.de
// Vorname: Amirreza
// Nachname: Jafari
// Ali.Alipour@tu-clausthal.de
// Vorname: Ali
// Nachname: Alipour

package tuc.isse.connectfour;

/**
 * Represents a game token with a color.
 * @author Amirreza Jafari
 * @author Ali Alipour
 */
public class Token extends GameObject {
    // حذف این خط: public enum Color { RED, BLUE }
    private final Color color; // استفاده از Color جداگانه

    /**
     * Constructs a token with the specified color.
     * @param color The color of the token (RED or BLUE)
     */
    public Token(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
    }

    /**
     * Gets the color of the token.
     * @return The color of the token
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns a string representation of the token.
     * Returns "X" for RED and "O" for BLUE as required by the project.
     * @return A string representing the token
     */
    @Override
    public String toString() {
        return color == Color.RED ? "X" : "O";
    }
}