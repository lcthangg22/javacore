package demo_buildin_function_interface;

import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        List<String> names = List.of("A","B","C");

        // Cách 1 : Sử dụng lambda
        names.forEach(name -> System.out.println());

        // Cách 2 : Method reference
        names.forEach(System.out::println);

        // Cách 3 :
        // Khai báo consumer
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(consumer);
    }
}
