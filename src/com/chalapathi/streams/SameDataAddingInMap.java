package com.chalapathi.streams;



import java.util.*;
        import java.util.stream.Collectors;

class EmployeeSM {
    private Long id;
    private String status;

    public EmployeeSM(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}

public class SameDataAddingInMap {
    public static void main(String[] args) {
        // Existing map
        Map<Long, String> prevStatus = new HashMap<>();
        prevStatus.put(1L, "Active");
        prevStatus.put(2L, "Inactive");

        // List of new employee records
        List<EmployeeSM> empRecords = Arrays.asList(
                new EmployeeSM(1L, "On Leave"),
                new EmployeeSM(3L, "Active"),
                new EmployeeSM(2L, "Inactive")
        );

        // Adding data to the existing map using streams
        empRecords.stream()
                .forEach(employee -> prevStatus.put(employee.getId(), employee.getStatus()));

        // Output the updated map
        prevStatus.forEach((id, status) -> System.out.println("ID: " + id + ", Status: " + status));
    }
}
