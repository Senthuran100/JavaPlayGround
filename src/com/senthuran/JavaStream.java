package com.senthuran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class JavaStream {

    public static class Employee{
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

        public Employee(int id, String name, String role, double salary) {
            this.id = id;
            this.name = name;
            this.role = role;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        number.stream().filter(x -> x > 3).forEach(System.out::println);
        System.out.println(square);

        List<String> stringList = Arrays.asList("foo","bar","baz");
        List<String> startsWithB = stringList.stream().filter(a->a.startsWith("b")).collect(Collectors.toList());
        System.out.println(startsWithB);

        Employee e1 = new Employee(1,"Ben","Software Developer",10000);
        Employee e2 = new Employee(2,"Bob","Software Developer",20000);
        Employee e3 = new Employee(3,"kenny","Software Developer",30000);


        List<Employee> employees = Arrays.asList(e1,e2,e3);
        employees.stream().forEach(e->System.out.println(e.toString()));

        Double averageSalary= employees.stream().mapToDouble(e->e.getSalary()).average().orElse(Double.NaN);
        System.out.println("Aveareg Salary :"+averageSalary);

    }


}
