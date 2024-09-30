package com.chalapathi.test2;

 class YieldExample {
    public static void main(String[] args) {
        String day = "MONDAY";

        // Using switch expression with yield
        int dayNumber = switch (day) {
            case "MONDAY" -> 1 ;
            case "TUESDAY" -> 2;
            case "WEDNESDAY", "THURSDAY" -> 3;
            case "FRIDAY" -> 5;
            case "SATURDAY", "SUNDAY" -> 6;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("Day number: " + dayNumber);  // Output: Day number: 1


        // Using switch expression with yield in a block
        int daysNumber = switch (day) {
            case "MONDAY" -> {
                System.out.println("It's the start of the week");
                yield 1;  // Return 1 for MONDAY
            }
            case "FRIDAY" -> {
                System.out.println("It's almost the weekend");
                yield 5;  // Return 5 for FRIDAY
            }
            default -> {
                System.out.println("Middle of the week");
                yield 3;  // Return 3 for other days
            }
        };

        System.out.println("Day number: " + daysNumber);  // Output: Day number: 1

    }
}
