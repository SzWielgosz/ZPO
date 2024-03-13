package zad01;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new Gunman());
        player.doAttack();
        player.setAttackType(new Archer());
        player.doAttack();
        player.setAttackType(new Canoneer());
        player.doAttack();
        player.setAttackType(new Knight());
        player.doAttack();
    }
}