package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rs1) {
        if(rs1 == left + right) {
            return "added";
        }
        else if(rs1 == left - right) {
            return "subtracted";
        }
        else if(rs1 == left * right) {
            return "multiplied";
        }
        else if(rs1 == left / right) {
            return "divided";
        }
        else {
            return "none";
        }
    }
}
