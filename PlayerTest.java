import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testPlayerTakesDamageCorrectly() {
        Player player = new Player("A", 50, 5, 10);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
    }

    @Test
    public void testPlayerHealthDoesNotGoBelowZero() {
        Player player = new Player("A", 50, 5, 10);
        player.takeDamage(60);
        assertEquals(0, player.getHealth());
    }
}
