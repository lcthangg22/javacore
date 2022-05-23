package demo_buildin_function_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("An");
        names.add("Bm");
        names.add("Ck");

        names.forEach(System.out::println);

        // Cách 1 : Diễn giải bình thường
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        names.stream().map(function).forEach(System.out::println);

        // Cách 2 : Sử dụng lambda
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

        // Cách 3 : Method reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
