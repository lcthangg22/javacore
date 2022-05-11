package demo1;

import demo1.DemoAccess;

public class DemoAccess1 {
    public static void main(String[] args) {
        DemoAccess demoAccess = new DemoAccess("A",18,"a@gmail.com",1_000_000);

        // Name không thể truy cập outside class
        System.out.println(demoAccess.salary);
        System.out.println(demoAccess.email);
        System.out.println(demoAccess.age);
    }

}
