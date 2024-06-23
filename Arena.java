public class Arena {
    private Player player1;
    private Player player2;
    private Die die;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.die = new Die();
    }

    public Player fight() {
        Player attacker, defender;
        if (player1.getHealth() < player2.getHealth()) {
            attacker = player1;
            defender = player2;
        } else {
            attacker = player2;
            defender = player1;
        }

        while (attacker.isAlive() && defender.isAlive()) {
            attackRound(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        return attacker.isAlive() ? attacker : defender;
    }

    private void attackRound(Player attacker, Player defender) {
        int attackRoll = die.roll();
        int defendRoll = die.roll();

        System.out.println("attackRoll "+ attackRoll);
        System.out.println("defendRoll "+ defendRoll);
        
        int attackDamage = attacker.attack() * attackRoll;
        int defendValue = defender.defend() * defendRoll;
        int damageDealt = Math.max(0, attackDamage - defendValue);

        defender.takeDamage(damageDealt);
        System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damageDealt + " damage. " + defender.getName() + " health: " + defender.getHealth());
    }
}
