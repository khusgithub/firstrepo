import org.junit.Test;
import static org.junit.Assert.*;

public class DieTest {
    @Test
    public void testDieRollIsWithinRange() {
        Die die = new Die();
        for (int i = 0; i < 100; i++) {
            int roll = die.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
