package demo_buildin_function_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");

        // Xóa 1 name tên A
        names.removeIf(name -> name.equals("A"));
        names.forEach(System.out::println);

        // Xóa 1 name tên B
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("B");
            }
        };
        names.removeIf(predicate);
        names.forEach(System.out::println);

        System.out.println();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> result = getNumberIsOld(numbers, a -> a % 2 == 1);
        // 2 tham số (a,b) ->
        // 0 tham số ()
        // 1 tham số (a) hoặc a
        result.forEach(System.out::println);

    }

    public static List<Integer> getNumberIsOld(List<Integer> numbers,Predicate<Integer> predicate) {
        List<Integer> list = new ArrayList<>();
        for (Integer n: numbers) {
            if (predicate.test(n)) {
                list.add(n);
            }
        }
        return list;
    }
}

