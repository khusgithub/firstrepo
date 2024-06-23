import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class ArenaTest {
    @Test
    public void testArenaFightEndsWithOnePlayerDead() {
        Player player1 = new Player("A", 50, 5, 10);
        Player player2 = new Player("B", 100, 10, 5);
        Arena arena = new Arena(player1, player2);

        Player winner = arena.fight();

        assertTrue(winner.isAlive());
        assertFalse(player1.isAlive() && player2.isAlive());
    }
}
