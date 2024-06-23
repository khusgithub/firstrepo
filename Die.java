import java.util.Random;

public class Die {
    private static final int SIDES = 6;
    private Random random;

    public Die() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(SIDES) + 1;
    }
}
