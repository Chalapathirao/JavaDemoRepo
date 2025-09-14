package com.chalapathi.newfeatures.java12;

public class SwitchExpression {
    public static void main(String[] args) {
        int dayOfWeek = 5;
        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> {yield "Weekend";}
            default -> "Invalid day of the week";
        };
        System.out.println("Day type: " + dayType);
    }
}
