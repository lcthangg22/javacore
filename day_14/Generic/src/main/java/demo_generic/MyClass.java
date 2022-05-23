package demo_generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class MyClass<T> {
    private T obj;

    // Method generic
    public void demoMethod(T data) {
        System.out.println("Demo method generic...");
        System.out.println("Data = " + data);
    }

    // Method generic
    public <U extends Number> void demoMethod1(U data) {
        System.out.println("Demo method generic...");
        System.out.println("Data = " + data);
    }


    public static void main(String[] args) {
        // Khởi tạo đối tượng kiểu Integer
        MyClass<Integer> myClass = new MyClass<>(10);
        System.out.println(myClass.getObj());
        myClass.demoMethod(20);

        // Khởi tạo đối tượng kiểu Integer
        MyClass<String> myClass1 = new MyClass<>("hello");
        System.out.println(myClass1.getObj());
        myClass1.demoMethod("hello world");
        myClass1.demoMethod1(20);

        // Các kiểu dữ liệu kế thừa từ Number
        MyClass<? extends Number> myClass2 = new MyClass<>(10.5);
        System.out.println(myClass2.getObj());
//        myClass2.demoMethod();

        // Khởi tạo đối tượng kiểu Student
        MyClass<Student> myClass3 = new MyClass<>(new Student());
        System.out.println(myClass3.getObj());
    }

}
