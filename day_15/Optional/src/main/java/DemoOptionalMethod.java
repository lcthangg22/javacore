import java.util.Optional;

public class DemoOptionalMethod {
    public static void main(String[] args) {
        // Tạo đối tượng Optional
        // 1. Tạo optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        // 2. Tạo optional có giá trị khác null
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);

        // Một số phương thức
        // get() : Lấy ra giá trị trong optional
        // isPresent() và ifPresent() : Kiểm tra optional có giá trị hay không

//        if (optionalEmpty.isPresent()) {
//            System.out.println("Giá trị là : " + optionalEmpty.get());
//        } else {
//            System.out.println("Không có giá trị!");
//        }

        if (optionalEmpty.isEmpty()) {
            System.out.println("Không có giá trị");
        } else {
            System.out.println("Giá trị là : " + optionalEmpty.get());
        }

        if (stringOptional.isEmpty()) {
            System.out.println("Không có giá trị");
        } else {
            System.out.println("Giá trị là : " + stringOptional.get());
        }

        // ifPresent: Nếu optional có giá trị bên trong thì làm 1 cái gì đó
        stringOptional.ifPresent((s) -> System.out.println("Giá trị là : " + s));

        // orElse : Trả về giá trị của đối tượng Optional nếu giá trị != rỗng
        // Ngược lại -> trả về giá trị mặc định được truyền vào
        String value = optionalEmpty.orElse("Default value");
        System.out.println(value);

        String value1 = stringOptional.orElse("Default value");
        System.out.println(value1);

        // orElseThrow()
        // Nếu optional có giá trị -> trả về giá trị đó
        // Ngược lại -> throw exception
        String value2 = stringOptional.orElseThrow(() -> {
            throw new RuntimeException("Có lỗi xảy ra");
        });
        System.out.println(value2);

        try {
            String value3 = optionalEmpty.orElseThrow(() -> {
                throw new RuntimeException("Có lỗi xảy ra");
            });
            System.out.println(value3);
        } catch (RuntimeException e ) {
            System.out.println(e.getMessage());
        }
    }
}
