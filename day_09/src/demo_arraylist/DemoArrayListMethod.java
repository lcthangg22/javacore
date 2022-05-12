package demo_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");

        System.out.println(Arrays.toString(names.toArray()));

        // Thêm vào 1 vị trí bất kỳ
        names.add(1,"D");
        System.out.println(Arrays.toString(names.toArray()));

        // lấy size
        System.out.println(names.size());

        // Xóa tại vị trí chỉ định
        names.remove(1);
        System.out.println(Arrays.toString(names.toArray()));

        // Xóa theo object
        names.remove("C");
        System.out.println(Arrays.toString(names.toArray()));

        // Tạo arraylist khác
        ArrayList<String> namesOther = new ArrayList<>();
        namesOther.add("E");
        namesOther.add("F");

        names.addAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));

        // Kiểm tra 1 phần tử có nằm trong arraylist hay không
        System.out.println(names.contains("A"));
        System.out.println(names.contains("X"));

        System.out.println(names.indexOf("E"));

        names.add("E");
        System.out.println(Arrays.toString(names.toArray()));
        System.out.println(names.lastIndexOf("E"));

//        names.clear();
//        System.out.println(names.isEmpty());

        names.set(0,"Z");
        System.out.println(Arrays.toString(names.toArray()));

        names.retainAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));
    }
}
