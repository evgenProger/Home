package ru.job4j.arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            size = size + array[i].length;
        }
        int row = 0, col = 0;
        int dimension = (int) Math.ceil(Math.sqrt(size));
        int[][] result = new int[dimension][dimension];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[row][col] = array[i][j];
                col++;
                if (col == dimension) {
                    row++;
                    col = 0;
                }
            }
        }
        return result;
    }
}
