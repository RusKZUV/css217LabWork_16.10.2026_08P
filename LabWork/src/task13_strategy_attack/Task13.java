package task13_strategy_attack;

public class Task13 {
    public static void main(String[] args) {
        int str = 20;

        System.out.println("Melee: " + new MeleeAttack().computeDamage(str));
        System.out.println("Ranged: " + new RangedAttack().computeDamage(str));
        System.out.println("Magic: " + new MagicAttack().computeDamage(str));

        // in this task i found RPG attack damage: melee, ranged, and magic
    }
}