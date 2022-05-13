package controller;

import model.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    // Tạo đối tượng từ EmployeeService
    private final EmployeeService employeeService = new EmployeeService();

    public void run() {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0;

        while (isContinue) {
            printMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 : {
                    ArrayList<Employee> employees = employeeService.getEmployees();
                    if (employees.isEmpty()) {
                        System.out.println("Không có nhân viên nào trong danh sách!");
                    } else {
                        System.out.println("Danh sách nhân viên :");
                        employeeService.printInfo(employees);
                    }
                    break;
                }
                case 2 : {
                    Employee employee = employeeService.creatEmployee();
                    System.out.println("Nhân viên vừa được thêm là : ");
                    System.out.println(employee);
                    break;
                }
                case 3 : {
                    System.out.println("Nhập tên : ");
                    String name  = sc.nextLine();
                    ArrayList<Employee> employees = employeeService.findByName(name);
                    if (employees.isEmpty()) {
                        System.out.println("Không có nhân viên nào có tên là " + name + " trong danh sách!");
                    } else {
                        System.out.println("Nhân viên có tên là : " + name + " bao gồm : ");
                        employeeService.printInfo(employees);
                    }
                    break;
                }
                case 4 : {
                    System.out.println("Nhập id : ");
                    int id = Integer.parseInt(sc.nextLine());
                    Employee employee = employeeService.findById(id);
                    if (employee == null) {
                        System.out.println("Không có nhân viên nào có tên là " + id + " trong danh sách!");
                    } else {
                        System.out.println("Nhân viên có tên là : " + id + " là :  ");
                        System.out.println(employee);
                    }
                    break;
                }
                case 5 : {
                    System.out.println("Nhập vào id muốn xóa : ");
                    int id = Integer.parseInt(sc.nextLine());
                    Employee employee = employeeService.findById(id);
                    if (employee == null) {
                        System.out.println("Không có nhân viên nào có id là " + id + " trong danh sách!");
                    } else {
                        employeeService.deleteEmployee(id);
                        System.out.println("Xóa thành công nhân viên có id = " + id);
                    }
                    break;
                }
                case 6 : {
                    ArrayList<Employee> employees = employeeService.findBySalary(5_000_000,10_000_000);
                    if (employees == null) {
                        System.out.println("Không có nhân viên nào có mức lương từ 5.000.000 -> 10.000.000");
                    } else {
                        System.out.println("Nhân viên có mức mức lương từ 5.000.000 -> 10.000.000 bao gồm : ");
                        employeeService.printInfo(employees);
                    }
                    break;
                }
                case  7 : {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp!");
                    break;
                }
            }
        }
    }

    private void printMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1. In ra thông tin nhân viên");
        System.out.println("2. Thêm nhân viên mớ");
        System.out.println("3. Tìm kiếm nhân viên theo name");
        System.out.println("4. Tìm kiếm nhân viên theo id");
        System.out.println("5. Xóa nhân viên theo id");
        System.out.println("6. Tìm kiếm nhân viên có mức lương từ 5.000.000 --> 10.000.000");
        System.out.println("7. Thoát\n");
    }
}
