package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        if (Character.compare(left.charAt(0), right.charAt(0)) == 0
            || Character.compare(left.charAt(1), right.charAt(1)) == 0) {
            return true;
        };
        return false;

    }

}
