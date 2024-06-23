public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("A", 50, 5, 10);
        Player player2 = new Player("B", 100, 10, 5);

        Arena arena = new Arena(player1, player2);
        Player winner = arena.fight();

        System.out.println("Winner: " + winner.getName());
    }
}
