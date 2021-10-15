package com.senthuran;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTryOut {
    public static void main(String[] args) {
        JavaStream.Employee e1 = new JavaStream.Employee(1, "Bob", "Software Developer", 10000, "false");
        JavaStream.Employee e2 = new JavaStream.Employee(2, null, "Software Developer", 20000, "false");
        JavaStream.Employee e3 = new JavaStream.Employee(3, "kenny", "DevOps", 30000, "false");

        List<JavaStream.Employee> employees = Arrays.asList(e1, e2, e3);

        Double value = employees.stream().mapToDouble(e -> e.getSalary()).min().orElse(Double.NaN);
        System.out.println("Min Value : " + value);
        
        JavaStream.Employee emp = employees.stream()
                .filter(e -> e.getName().equals("Bob"))
                .findFirst()
                .orElse(new JavaStream.Employee(12, "Sample", "devops", 23333, "true"));

        System.out.println("Employee : " + emp);

        Optional<String> employeeName = Optional.of(Optional.ofNullable(e1.getName()).orElse("Empty Value"));

        System.out.println("employeeName : " + employeeName.map(String::toUpperCase).orElse("Empty Value"));
    }
}
