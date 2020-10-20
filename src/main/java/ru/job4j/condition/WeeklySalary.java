package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {
            if(i < 5) {
                if(hours[i] == 8) {
                    salary = salary + hours[i] * 10;
                }
                else if (hours[i] > 8 && hours[i] != 0) {
                    salary = salary + (8 * 10) + ((hours[i] - 8) * 15);
                }
            }
            else {
                if(hours[i] == 8 || hours[i] < 8) {
                    salary = salary + hours[i] * 20;
                }
                else if(hours[i] > 8 && hours[i] != 0) {
                    salary = salary + (8 * 20) + ((hours[i] - 8) * 30);
                }

            }
        }
        return salary;
    }
}
