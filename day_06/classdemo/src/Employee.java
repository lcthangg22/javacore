public class Employee {
    // Khai báo thuộc tính
    public String name;
    public int age;
    public String address;
    public int totalHours;

    public Employee() {}

    public Employee(String name, int age, String address, int totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.totalHours = totalHours;
    }

    public double getSalary() {
        double bonus = 0;
        double salary = 0;
        if (totalHours >= 200) {
            bonus = salary * 0.2;
        } else if (totalHours >= 100 && totalHours <= 200) {
            bonus = salary * 0.1;
        } if (totalHours < 100){
            bonus = 0;
        }
        salary = totalHours * 200000 + bonus;
        return salary;
    }

    public void printInfo () {
        System.out.println(name + age + address + getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", totalHours=" + totalHours + ", Salary = " + getSalary() + '}';
    }
}
