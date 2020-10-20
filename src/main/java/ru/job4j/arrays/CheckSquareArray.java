package ru.job4j.arrays;

public class CheckSquareArray {
    public static boolean checkArray(int[][] array) {
        boolean rs1 = true;
        int standard = array.length;
        for(int i = 0; i < array.length; i++) {
            if(array[i].length != standard) {
                rs1 = false;
                break;
            }
        }
        return rs1;
    }
}
