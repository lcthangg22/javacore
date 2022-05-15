package demo_abstract;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        // Không thể trực tiếp khởi tạo đối tượng từ class abstract --> error
        // Employee employee = new Employee();

        // Khởi tạo đối tượng từ class Developer
        Developer developer = new Developer(1,"A","a@gmail.com",2_000_000,20);
        developer.register();
        System.out.println(developer.calculateSalary());

        // Khởi tạo đối tượng từ class Developer
        Tester tester = new Tester(2,"B","b@gmail.com",4_000_000,40);
        tester.register();
        System.out.println(tester.calculateSalary());

        // Tính lương cho 1 danh sách nhân viên
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(developer);
        employees.add(new Developer(3,"C","c@gmail.com",6_000_000,10));
        employees.add(tester);
        employees.add(new Tester(4,"D","d@gmail.com",8_000_000,20));

        // Sử dụng vòng lặp dể tính lương
        int totalSaraly = 0;
        for (Employee e: employees) {
            System.out.println("Tên = " + e.getName() + " Lương = " + e.calculateSalary());
            totalSaraly += e.calculateSalary();
        }

        System.out.println("Lương phải trả cho nhân viên = " + totalSaraly);

        // Sắp xếp theo tên
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee e: employees) {
            System.out.println(e);
        }

        // Sắp xếp theo lương thực lĩnh
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.calculateSalary() - o1.calculateSalary();
            }
        });

        System.out.println();

        for (Employee e: employees) {
            System.out.println(e + " lương = " + e.calculateSalary());
        }
    }
}
