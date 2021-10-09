package com.senthuran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class JavaStream {

    public static class Employee {
        public String flag;
        private int id;
        private String name;
        private String role;
        private double salary;

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
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

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public Employee(int id, String name, String role, double salary, String flag) {
            this.id = id;
            this.name = name;
            this.role = role;
            this.salary = salary;
            this.flag = flag;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "flag='" + flag + '\'' +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        number.stream().filter(x -> x > 3).forEach(System.out::println);
        System.out.println(square);

        List<String> stringList = Arrays.asList("foo", "bar", "baz");
        List<String> startsWithB = stringList.stream().filter(a -> a.startsWith("b")).collect(Collectors.toList());
        System.out.println(startsWithB);

        Employee e1 = new Employee(1, "Bob", "Software Developer", 10000, "false");
        Employee e2 = new Employee(2, "Ben", "Software Developer", 20000, "false");
        Employee e3 = new Employee(3, "kenny", "DevOps", 30000, "false");

        List<Employee> employees = Arrays.asList(e1, e2, e3);
        employees.stream().forEach(e -> System.out.println(e.toString()));

        Double averageSalary = employees.stream().mapToDouble(e -> e.getSalary()).average().orElse(Double.NaN);
        System.out.println("Aveareg Salary :" + averageSalary);

        System.out.println(employees.stream().anyMatch(e -> e.name.equals("Ben")));

        Double maxSalary = employees.stream().mapToDouble(e -> e.getSalary()).max().orElse(Double.NaN);
        System.out.println("Max Salary :" + maxSalary);

        Double maxSalaryParralelStream = employees.parallelStream().mapToDouble(e->e.getSalary()).sum();
        System.out.println("Max Salary using Parralel Stream :"+maxSalaryParralelStream);

        List<Employee> sortedEmployees = employees.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()))
                .collect(Collectors.toList());
        System.out.println("Sorted Order : " + sortedEmployees);

        List<Employee> mappedEmployees = employees.stream().map(e -> {
            Employee employee = new Employee(e.getId(), e.getName(), "DevOps", 25000, "true");
            return employee;
        }).collect(Collectors.toList());
        System.out.println("Mapped Employees : " + mappedEmployees);

        List<String> roles = employees.stream().map(e -> e.getRole()).distinct().collect(Collectors.toList());
        System.out.println("Roles : " + roles);

    }

}
