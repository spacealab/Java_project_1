package tuc.isse.uebung07.viergewinnt;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
    @Test
    public void testDropToken() {
        Board board = new Board();
        Token token = new Token(Token.Color.RED);
        assertTrue(board.dropToken(token, 3));
    }

    @Test
    public void testColumnFull() {
        Board board = new Board();
        Token token = new Token(Token.Color.BLUE);
        for (int i = 0; i < 6; i++) {
            board.dropToken(token, 3);
        }
        assertFalse(board.dropToken(token, 3));
    }
}
