package demo1;

public class DemoAccess {
    private String name;

    public int age;

    protected String email;

    int salary;

    public DemoAccess() {
    }

    public DemoAccess(String name, int age, String email, int salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public static void main(String[] args) {
        DemoAccess demoAccess = new DemoAccess("A",18,"a@gmail.com",1_000_000);
        System.out.println(demoAccess.age);
        System.out.println(demoAccess.name);
        System.out.println(demoAccess.email);
        System.out.println(demoAccess.salary);
    }
}
