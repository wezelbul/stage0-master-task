package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap = (year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0));
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9 -> 30;
            default -> -1;
        };
        if (days < 0 || year < 0) {
            System.out.println("invalid date");
            return;
        }
        days = isLeap ? ++days : days;
        System.out.println(days);
    }
}