package com.chalapathi.newfeatures.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {

    public static void main(String[] args) {
        // findEvenNumbers();
        // findOddNumbersUsingCustomPredicate();
        // collectingAsList();
        // convertStreamOfStringsToStreamOfIntegers();
        // distinctSalariesOfAllEmployees();
//		streamSorting();
//		streamSortingUsingComparator();
        // streamSortingUsingCustomComparator();
        // streamSkip();
        // minStream();
        // minStreamWithComparator();
        // streamAnyMatch();
        // anyMatchWithCombinedCondition();
        streamFindFirst();
        streamFindAny();
    }

    // Find even numbers in stream
    public static void findEvenNumbers() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    }

    // Filtering a Stream using Custom Predicate
    private static void findOddNumbersUsingCustomPredicate() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if (n % 2 == 1) {
                    return true;
                }
                return false;
            }

        };

        list.stream().filter(predicate).forEach(System.out::println);
    }

    // Collecting filtered items into a List
    private static void collectingAsList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    // convert Stream of String to stream of integres
    private static void convertStreamOfStringsToStreamOfIntegers() {
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numbers = listOfStrings.stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
        System.out.println(numbers);

        // or

        List<Integer> numbers1 = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(numbers1);
    }

    // find all distinct salaries among all employees
    private static void distinctSalariesOfAllEmployees() {

        List<Employee> employeesList = Arrays.asList(new Employee(101, "John", 29, "Male", "HR", 2015, 35000), new Employee(102, "Alice", 28, "Female", "Finance", 2016, 55000));

        List<Double> sal = employeesList.stream().map(e -> e.salary).distinct().collect(Collectors.toList());
        System.out.println(sal);
        // OR
        Set<Double> sal1 = employeesList.stream().map(e -> e.getSalary()).collect(Collectors.toSet());
        System.out.println(sal1);

        // OR
        Set<Double> salList = new HashSet<>();
        employeesList.stream().forEach(e -> salList.add(e.getSalary()));
        System.out.println(salList);

        // OR
        Set<Double> salList1 = new HashSet<>();
        for (Employee e : employeesList) {
            salList1.add(e.getSalary());
        }
        System.out.println(salList1);

    }

    // Sort in natural order
    private static void streamSorting() {

        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        // OR
        Collections.sort(list);
        System.out.println(list);
    }

    // Sort in reverse order
    private static void streamSortingUsingComparator() {

        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        // OR
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

    // Sorting Stream using custom Comparator
    private static void streamSortingUsingCustomComparator() {

        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        List<Integer> sortedList = list.stream().sorted(reverseComparator).collect(Collectors.toList());
        System.out.println(sortedList);

        // OR

        List<Integer> sortedList1 = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(sortedList1);
        // OR
        Collections.sort(list, (i1, i2) -> i2.compareTo(i1));
        System.out.println(list);
    }

    // Stream.skip() example
    private static void streamSkip() {

        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        List<Integer> newList = evenNumInfiniteStream.skip(4).limit(10).collect(Collectors.toList());
        System.out.println(newList);
    }

    // Select smallest element from stream
    private static void minStream() {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Integer minimum = list.stream().min((i, j) -> i.compareTo(j)).get();
        System.out.println(minimum);
    }

    // Select minimum element from stream
    private static void minStreamWithComparator() {

        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        Comparator<Integer> minComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Integer minimum = list.stream().min(minComparator).get();
        System.out.println(minimum);
    }

    // Stream.anyMatch() example
    private static void streamAnyMatch() {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        boolean anyMatch = stream.anyMatch(s -> s.contains("four"));
        System.out.println(anyMatch);
    }

    private static void anyMatchWithCombinedCondition() {

        List<Employ> empList = new ArrayList<>();
        empList.add(new Employ(1, "A", 46, 30000));
        empList.add(new Employ(2, "B", 56, 30000));
        empList.add(new Employ(3, "C", 42, 50000));
        empList.add(new Employ(4, "D", 52, 50000));
        empList.add(new Employ(5, "E", 32, 80000));
        empList.add(new Employ(6, "F", 72, 80000));
        Stream<Employ> stream = empList.stream();

        Predicate<Employ> olderThan50 = e -> e.getAge() > 50;
        Predicate<Employ> earningMoreThan40K = e -> e.getSalary() > 40_000;
        Predicate<Employ> combinedCondition = olderThan50.and(earningMoreThan40K);
        boolean anyMatch = stream.anyMatch(combinedCondition);
        System.out.println(anyMatch);
    }

    private static void streamFindFirst() {
        Stream.of("one", "two", "three", "four").findFirst().ifPresent(System.out::println);
    }

    private static void streamFindAny() {
        Stream.of("Zero", "one", "two", "three", "four").findAny().ifPresent(System.out::println);
    }

}

/*class Employee {
	int id;
	String Name;
	int salary;

	public Employee(int id, String name, int i) {
		super();
		this.id = id;
		Name = name;
		this.salary = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}*/

class Employ {
    private long id;
    private String name;
    private int age;
    private double salary;

    public Employ(long id, String name, int age, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
