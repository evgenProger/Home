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
                if (j - 1 >= 0) {
                    place_left = places[i][j - 1];

                }
                else if (j <= places[i].length - 1) {
                    place_right = places[i][j + 1];

                }
                else if (i - 1 >= 0) {
                    place_up = places[i - 1][j];
                }
                else  {
                    place_down = places[i + 1][j];
                }
                if (place_down == null &&
                        place_up == null &&
                        place_left == null &&
                        place_right == null &&
                        places[i][j] == null) {
                    rs = true;
                    row = i;
                    column = j;
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