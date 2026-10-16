package task13_strategy_attack;

public class MeleeAttack implements AttackStrategy {
    public int computeDamage(int baseStrength) {
        return baseStrength * 2;
    }
}