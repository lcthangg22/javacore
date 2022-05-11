package demo;

import demo1.DemoAccess;

public class DemoAccess2 extends DemoAccess {
    public DemoAccess2() {
    }

    public DemoAccess2(String name, int age, String email, int salary) {
        super(name, age, email, salary);
    }

    public static void main(String[] args) {
        DemoAccess demoAccess = new DemoAccess("A",18,"a@gmail.com",1_000_000);
        System.out.println(demoAccess.age);
    }
}
