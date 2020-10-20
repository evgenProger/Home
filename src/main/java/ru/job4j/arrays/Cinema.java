package ru.job4j.arrays;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int row = 1, column = 1;
        boolean rs = false;
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                Place place_left = null;
                Place place_right = null;
                Place place_down = null;
                Place place_up = null;
                if (j == places[i].length - 1) {
                    place_left = places[i][j - 1];
                    place_down = places[i + 1][j];
                    if (place_left == null && place_down == null && places[i][j] == null) {
                        row = i;
                        column = j;
                        rs = true;
                        break;
                    }
                }
                if (i == places.length - 1 && j == places[i].length - 1) {
                    place_up = places[i - 1][j];
                    place_left = places[i][j - 1];
                    if (place_left == null && place_up == null && places[i][j] == null) {
                        row = i;
                        column = j;
                        rs = true;
                        break;
                    }
                }
                if (i == places.length - 1) {
                    place_up = places[i - 1][j];
                    place_right = places[i][j + 1];
                    if (place_up == null && place_right == null && places[i][j] == null) {
                        row = i;
                        column = j;
                        rs = true;
                        break;

                    }
                }
                if(i == 0 && j == 0) {
                    place_down = places[i + 1][j];
                    place_right = places[i][j + 1];
                    if(place_down == null && place_right == null && places[i][j] == null) {
                        row = i;
                        column = j;
                        rs = true;
                        break;

                    }

                }

                place_left = places[i][j - 1];
                place_right = places[i][j + 1];
                place_up = places[i - 1][j];
                place_down = places[i + 1][j];
                if (place_left == null &&
                        place_right == null &&
                        place_up == null &&
                        place_down == null &&
                        places[i][j] == null) {
                    row = i;
                    column = j;
                    rs = true;
                    break;
                }




            }
            if (rs) {
                break;
            }

        }
        return rs ? new Place(row, column) : null;
    }






    public static class Place {
        private int row;
        private int cell;


        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row &&
                    cell == place.cell;
        }
        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }

        @Override
        public String toString() {
            return "Place{" +
                    "row=" + row +
                    ", cell=" + cell +
                    '}';
        }
    }
}