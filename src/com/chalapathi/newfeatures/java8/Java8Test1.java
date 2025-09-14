package com.chalapathi.newfeatures.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Test1 {
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
        /*Employee employee = FindEmployeesWithHighestSalary(employees);
        System.out.println(employee);*/

//        countOfEmployeesInEachDepartment(employees);
//        findDepartmentWithMaximumEmployees(employees);
//        EmployesWhoJoinedAfterCertainYear(employees, 2018);
//        EmployesWhoHRDept(employees);
//         allEmployeeNames(employees);
//        allDeptNames(employees);
//        allUniqueDepartmentNames(employees);
//        highestSalaryPerDepartment(employees);
//        System.out.println();
//        averageSalaryPerDepartment(employees);
//        groupByDepartmentAndAge(employees);
//        frequencyofElementsInList();
//        frequencyofElementsInString();
//        findTopNSalariedEmployees(employees,3);
//        partitionEmployeesBySalary(employees);

        //joinEmployeeNames(employees);
        //countMaleAndFemaleEmployees(employees);
        //averageAgeOfMaleandFemaleEmployees(employees);
//        youngestMaleEmployeeInITDepartment(employees);
//        mostExperiencedEmployee(employees);
  //      mostExperiencedEmployeeInEachDept(employees);
        //    totalAndAvgSalOfOrganization(employees);

//        nThHighestSalary(employees, 1);
//        nThHighestSalary(employees, 2);
//        nThHighestSalary(employees, 3);

        //  groupEmployeesBydepartment(employees);
       // emplyNamesBydepartmentSort(employees);
        //employeesStartsWithLetter(employees, "A");
        //sortEmployeesBySalary(employees);
        sorting1();
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John", 29, "Male", "HR", 2015, 35000));
        employees.add(new Employee(102, "Alice", 28, "Female", "Finance", 2016, 55000));
        employees.add(new Employee(103, "Bob", 35, "Male", "IT", 2012, 70000));
        employees.add(new Employee(104, "Daisy", 32, "Female", "IT", 2018, 50000));
        employees.add(new Employee(105, "Charlie", 26, "Male", "Sales", 2020, 30000));
        employees.add(new Employee(106, "Sophia", 40, "Female", "Admin", 2010, 40000));
        employees.add(new Employee(107, "David", 45, "Male", "Finance", 2005, 80000));
        employees.add(new Employee(108, "Emma", 31, "Female", "Sales", 2019, 45000));
        employees.add(new Employee(109, "Raj", 27, "Male", "IT", 2021, 38000));
        employees.add(new Employee(110, "Neha", 30, "Female", "HR", 2017, 42000));
        return employees;
    }

    //Find Employee(s) with the Highest Salary
    //Find the highest paid employee
    private static Employee FindEmployeesWithHighestSalary(List<Employee> employees) {
        // return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);

        /*double v = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0);
        return employees.stream().filter(e -> e.getSalary() == v).findFirst().orElse(null);*/

        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().orElse(null);

    }

    //Group Employees by Department
    private static void countOfEmployeesInEachDepartment(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((k, v) -> System.out.println(STR."\{k} \{v}"));
    }

    //Department with Maximum Employees
    //Find Departments with Max/Min Employees
    private static void findDepartmentWithMaximumEmployees(List<Employee> employees) {
        String departmentName = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println(departmentName);
    } //This finds the department(s) with the highest and lowest (min function) employee count.

    //Employees Who Joined After a Certain Year
    //Get the names of all employees who joined after 2018
    private static void EmployesWhoJoinedAfterCertainYear(List<Employee> employees, int yearOfJoining) {
        List<Employee> list = employees.stream().filter(e -> e.getYearOfJoining() > yearOfJoining).toList();
        System.out.println(list);
        // employees.stream().filter(e -> e.getYearOfJoining() > 2018).map(Employee::getName).forEach(System.out::println);
    }

    //Employees with 'HR' Department

    private static void EmployesWhoHRDept(List<Employee> employees) {
        List<Employee> list = employees.stream().filter(e -> Objects.equals(e.getDepartment(), "HR")).toList();
        System.out.println(list);
    }

    //Names of All Employees
    private static void allEmployeeNames(List<Employee> employees) {
        List<String> list = employees.stream().map(Employee::getName).toList();
        System.out.println(list);
    }

    //List of All department names
    private static void allDeptNames(List<Employee> employees) {
        List<String> list = employees.stream().map(Employee::getDepartment).toList();
        System.out.println(list);
    }

    //Gets all unique department names.
    private static void allUniqueDepartmentNames(List<Employee> employees) {
        // Set<String> set = employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        List<String> set = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(set);
    }
    // Highest Salary per Department

    private static void highestSalaryPerDepartment(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).forEach((k, v) -> System.out.println(STR."\{k} \{v.get().getName()}"));
    }

    //Average Salary per Department
    private static void averageSalaryPerDepartment(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))).forEach((k, v) -> System.out.println(STR."\{k} \{v}"));
    }

    // Group By Multiple Fields (Department & Age)
    private static void groupByDepartmentAndAge(List<Employee> employees) {
        Map<String, Map<Integer, List<Employee>>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getAge)));
        System.out.println(collect);
    }

    //Find Frequency of Elements in a List
    private static void frequencyofElementsInList() {
        List<Integer> list = List.of(3, 5, 7, 3, 9, 4, 7, 9, 0, 22, 5, 8, 22);
        Map<Integer, Long> freq = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(freq);
    }

    // Find Frequency of Elements in a String
    private static void frequencyofElementsInString() {
        String str = "missippi is a not proper word please check";
        Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(freq);
    }

    //Find Top N Salaried Employees
    private static void findTopNSalariedEmployees(List<Employee> employees, int n) {
        List<Employee> list = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(n).toList();
        System.out.println(list);
    }

    //Partition Employees by Salary Threshold
    //Partition employees by age > 30
    private static void partitionEmployeesBySalary(List<Employee> employees) {
        Map<Boolean, List<Employee>> partitioned = employees.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));
        System.out.println(partitioned);
        //Gives two lists: employees older than 30 and younger/equal.
        //Map<Boolean, List<Employee>> partition = employees.stream()
        //        .collect(Collectors.partitioningBy(e -> e.getAge() > 30));
        //System.out.println(partition);
    }

    //Join Names with Delimiters, Prefix, Suffix
    private static void joinEmployeeNames(List<Employee> employees) {
        String names = employees.stream().map(Employee::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(names);
    }

    //Count male and female employees in the organization
    private static void countMaleAndFemaleEmployees(List<Employee> employees) {
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
    }

    //Find the average age of male and female employees
    private static void averageAgeOfMaleandFemaleEmployees(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))).forEach((k, v) -> System.out.println(STR."\{k} \{v}"));
    }

    //Youngest male employee in IT department
    private static void youngestMaleEmployeeInITDepartment(List<Employee> employees) {
        employees.stream().filter(e -> e.getDepartment() == "IT" && e.getGender() == "Male").min(Comparator.comparingInt(Employee::getAge)).ifPresent(System.out::println);
    }

    //Find the most experienced employee (earliest joining year)
    private static void mostExperiencedEmployee(List<Employee> employees) {
        employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).ifPresent(System.out::println);
    }

    //Who has the most working experience in each department
    private static void mostExperiencedEmployeeInEachDept(List<Employee> employees) {
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)))).forEach((k, v) -> System.out.println(STR."\{k} \{v.get()}"));
    }

    //Find the average and total salary of the whole organization
    private static void totalAndAvgSalOfOrganization(List<Employee> employees) {
        DoubleSummaryStatistics stats = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(STR."Total salary: \{stats.getSum()}");
        System.out.println(STR."Average salary: " + stats.getAverage());
        System.out.println(STR."Max salary: " + stats.getMax());
        System.out.println(STR."Minimum salary: " + stats.getMin());
    }

    //Find second-highest salary employee(s)
    private static void nThHighestSalary(List<Employee> employees, int n) {
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(n - 1)
                .findFirst().ifPresent(System.out::println);
    }

    //Group employees by department and list employee names
    private static void groupEmployeesBydepartment(List<Employee> employees) {
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(collect);

        Map<String, List<String>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect1);
    }
    //List the names of employees by department (sorted alphabetically

    private static void emplyNamesBydepartmentSort(List<Employee> employees) {
        Map<String, List<String>> sortedNamesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.collectingAndThen(Collectors.toList(),
                                        list -> list.stream().sorted().collect(Collectors.toList())))));
        System.out.println(sortedNamesByDept);
    }

    //Find employees whose names start with ‘A’.

    private static void employeesStartsWithLetter(List<Employee> employees, String letter){
        employees.stream().filter(e -> e.getName().startsWith(letter)).forEach(System.out::println);
    }
    //Sort employees by salary (ascending or descending)
    private static void sortEmployeesBySalary(List<Employee> employees){
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
        //List<Employee> sortedDesc = employees.stream()
        //    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
        //    .collect(Collectors.toList());
    }
    //Sort employees by salary and Age(ascending or descending)
    private static void sortEmployeesBySalaryAndAge(List<Employee> employees){
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getAge)).forEach(System.out::println);

        //List<Employee> sortedList = employees.stream()
        //    .sorted(Comparator.comparing(Employee::getName)
        //                      .thenComparingDouble(Employee::getSalary))
        //    .collect(Collectors.toList());
    }

    private static void sorting1(){
        List<Integer> sortedNumbers = Stream.of(5, 2, 8, 1)
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(sortedNumbers);
        List<Integer> sortedNumbers1 = Stream.of(5, 2, 8, 1)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedNumbers1);
        List<Integer> reverseSorted = sortedNumbers.stream()
                .sorted((i1, i2) -> i2.compareTo(i1))
                .toList();
        System.out.println(reverseSorted);
    }
    //Sort a stream using natural order or a custom Comparator

}

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR."Employee{id=\{id}, name='\{name}', age=\{age}, gender='\{gender}', department='\{department}', yearOfJoining=\{yearOfJoining}, salary=\{salary}}";
    }
}
