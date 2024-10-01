package com.chalapathi.test3;

import java.util.EnumMap;

//enum Day {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//}

public class EnumMapExample {
    public static void main(String[] args) {
        // Create an EnumMap with Day as the key and String as the value
        EnumMap<Day, String> dayActivities = new EnumMap<>(Day.class);

        dayActivities.put(Day.MONDAY, "Gym");
        dayActivities.put(Day.TUESDAY, "Swimming");
        dayActivities.put(Day.SUNDAY, "Relaxing");

        System.out.println("Activities on Sunday: " + dayActivities.get(Day.SUNDAY));

        // Iterate through the EnumMap
        for (Day day : dayActivities.keySet()) {
            System.out.println(day + ": " + dayActivities.get(day));
        }
    }
}

