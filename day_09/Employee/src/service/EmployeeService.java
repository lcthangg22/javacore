package service;

import model.Employee;

import java.util.*;

public class EmployeeService {
    // Tạo list nhân viên để quản lý
    private ArrayList<Employee> employees;

    // Khởi tạo data từ constructor
    public EmployeeService() {
        init();
    }

    // Khởi tạo data
    public void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1,"A","a@gmail.com",2_000_000));
        employees.add(new Employee(2,"B","b@gmail.com",4_000_000));
        employees.add(new Employee(3,"C","c@gmail.com",6_000_000));
        employees.add(new Employee(4,"D","d@gmail.com",8_000_000));
    }

    // Trả về danh sách nhân viên
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // In ra thông tin
    public void printInfo(ArrayList<Employee> list) {
        for (Employee employee: list) {
            System.out.println(employee);
        }
    }

    // Thêm nhân viên mới
    public Employee creatEmployee() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Nhập tên : ");
        String name = sc.nextLine();

        System.out.println("Nhập email : ");
        String email = sc.nextLine();

        System.out.println("Nhập lương : ");
        int salary = Integer.parseInt(sc.nextLine());

        // Khởi tạo đối tượng
        Employee employee = new Employee(rd.nextInt(100),name,email,salary );

        // Thêm vào danh sách dể quản lý
        employees.add(employee);
        return employee;
    }

    // Tìm kiếm theo tên : Có thể trả về nhiều nhân viên cùng tên
    public ArrayList<Employee> findByName(String name) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e: employees) {
            if (e.getName().toLowerCase().contains(name.toLowerCase(Locale.ROOT))) {
                list.add(e);
            }
        }
        return list;
    }

    // Tìm kiếm theo id : Nếu có thì trả về nhân viên duy nhất
    public Employee findById(int id) {
        for (Employee e: employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // Xóa theo id
    public void deleteEmployee(int id) {
        // TODO
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
            }
        }
    }

    public ArrayList<Employee> findBySalary(int minSalara, int maxSalary) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e: employees) {
            if (e.getSalary() > minSalara && e.getSalary() < maxSalary) {
                list.add(e);
            }
        }
        return list;
    }
}
