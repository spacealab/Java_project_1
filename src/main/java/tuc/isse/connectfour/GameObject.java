// Ali.Alipour@tu-clausthal.de
// Vorname: Ali
// Nachname: Alipour
// amirreza.jafari@tu-clausthal.de
// Vorname: Amirreza
// Nachname: Jafari

package tuc.isse.connectfour;

/**
 * Abstract class representing a general game object.
 * All game components inherit from this class and must implement toString.
 * @author Amirreza Jafari (amirreza.jafari@tu-clausthal.de)
 * @author Ali Alipour (Ali.Alipour@tu-clausthal.de)
 */
public abstract class GameObject {
    /**
     * Returns a string representation of the game object.
     * @return A string describing the object
     */
    public abstract String toString();
}