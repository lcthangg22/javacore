import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Foreach duyệt
        for (int n: numbers) {
            System.out.println(n);
        }

        numbers.addFirst(0);
        numbers.addLast(100);
        System.out.println(numbers.toString());

        numbers.pop();
        System.out.println(numbers.toString());

        numbers.push(22);
        System.out.println(numbers.toString());

        numbers.removeFirst();

        // Set interface
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set.toString());

        // Map interface
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        Set<Integer> keyset = map.keySet();
        for (Integer key: keyset) {
            System.out.println(map.get(key));
        }

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer ,String> entry: entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Class Collections
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(1);

       int max =  Collections.max(numbers1);
        System.out.println("Max = " + max);

        Collections.sort(numbers1);
        System.out.println(numbers1.toString());

        Collections.sort(numbers1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(numbers1.toString());

        Collections.reverse(numbers1);
        System.out.println(numbers1.toString());

        Collections.sort(numbers1, Collections.reverseOrder());
        System.out.println(numbers1.toString());
    }
}
