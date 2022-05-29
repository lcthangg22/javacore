import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        // Tạo đối tượng Optional
        // 1. Tạo optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        // 2. Tạo optional có giá trị khác null
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);

        // 3. Tạo optional có giá trị cụ thể
        // Giá trị này có thể null hoặc không

        Optional<Integer> integerOptional = Optional.ofNullable(1);
        Optional<Integer> integerOptional1 = Optional.ofNullable(null);
        System.out.println(integerOptional);
        System.out.println(integerOptional1);


    }
}
