package demo_generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T> {

    void add(T obj);

    void remove(T obj);

    void print();
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DemoGenericInterface<T> implements InterfaceGeneric<T> {
    private List<T> list;


    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public void print() {
        for (T obj : list) {
            System.out.println(obj + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // List Integer
//        InterfaceGeneric<Student> interfaceGeneric = new DemoGenericInterface<>(new ArrayList<>());

//        // Add
//        interfaceGeneric.add(1);
//        interfaceGeneric.add(2);
//        interfaceGeneric.add(3);
//        interfaceGeneric.print();
//
//        // Xóa
//        interfaceGeneric.remove(3);
//        System.out.println();

        // List Student
        InterfaceGeneric<Student> studentss = new DemoGenericInterface<>(new ArrayList<>());
        Student student = new Student("d",21);
        studentss.add(student);
        studentss.add(new Student("a",18));
        studentss.add(new Student("b",18));
        studentss.add(new Student("c",18));

        studentss.print();

        studentss.remove(student);
        studentss.print();
    }
}
