package com.chalapathi.interview1;
import java.util.Date;


final class CustomImmutable {
    private final int immutableField;
    private final Date mutableField;

    public CustomImmutable(int immutableField, Date mutableField) {
        this.immutableField = immutableField;
        if (mutableField == null) {
            throw new IllegalArgumentException("Mutable field cannot be null");
        }
        // Always use a deep copy for mutable objects
        this.mutableField = new Date(mutableField.getTime());
    }

    public int getImmutableField() {
        return immutableField;
    }

    public Date getMutableField() {
        // Return a copy of mutable object
        return new Date(mutableField.getTime());
    }
}



public class CustomImmutableClient {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date();

        // Print the original Date
        System.out.println("Original Date: " + date);

        // Create an instance of CustomImmutable
        CustomImmutable immutableObject = new CustomImmutable(123, date);

        // Retrieve values from immutable object
        System.out.println("Immutable Field: " + immutableObject.getImmutableField());
        System.out.println("Mutable Field: " + immutableObject.getMutableField());

        // Try to modify the mutable field through the getter (by getting mutable field and modifying it)
        Date retrievedDate = immutableObject.getMutableField();
        retrievedDate.setTime(retrievedDate.getTime() + 100000);

        // Show that the internal state of immutableObject is not changed
        System.out.println("Adjusted Mutable Field: " + retrievedDate);
        System.out.println("Internal State Mutable Field: " + immutableObject.getMutableField());

        // Show original status of the mutable object's internal copy comparing with external mutation
        System.out.println("Original Date After Attempted Mutable Field Modification: " + date);
        System.out.println("Original Mutable Field in Immutable Object Remains Unchanged: " + immutableObject.getMutableField());
    }
}
