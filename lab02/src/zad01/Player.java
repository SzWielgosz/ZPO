package zad01;

public class Player {
    AttackType attackType;

    public Player(AttackType attackType) {
        this.attackType = attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public void doAttack(){
        this.attackType.attack();
    }
}
