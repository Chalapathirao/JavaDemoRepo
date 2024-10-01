package com.chalapathi.test3;

import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        // Create an EnumSet containing some specific days
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        weekend.add(Day.THURSDAY);//
        // Create an EnumSet containing all days of the week
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("Weekend Days: " + weekend);
        System.out.println("All Days: " + allDays);
        allDays.remove(Day.SUNDAY);
        System.out.println(allDays);
    }
}
