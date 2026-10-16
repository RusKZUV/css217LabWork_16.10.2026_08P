package task13_strategy_attack;

public class MagicAttack implements AttackStrategy {
    public int computeDamage(int baseStrength) {
        return baseStrength * 3 - 10;
    }
}