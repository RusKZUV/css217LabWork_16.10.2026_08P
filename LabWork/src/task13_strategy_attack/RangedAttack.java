package task13_strategy_attack;

public class RangedAttack implements AttackStrategy {

    public int computeDamage(int baseStrength) {
        return baseStrength + 15;
    }
}