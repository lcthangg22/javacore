package demo_buildin_function_interface;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DemoSupplier {
    public static void main(String[] args) {

        Random rd = new Random();

        // Cách 1
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return rd.nextInt(100);
            }
        };
        List<Integer> numbers = Stream.generate(supplier).limit(5).toList();

        numbers.forEach(System.out::println);

        System.out.println();

        // Cách 2
        List<Integer> numbers1 = Stream.generate(() -> rd.nextInt(100)).limit(5).toList();

        numbers1.forEach(System.out::println);
    }
}
