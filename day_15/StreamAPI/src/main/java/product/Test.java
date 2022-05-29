package product;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Tạo ra danh sách sản phẩm
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 13 Pro Max", 30_000_000, "Apple", 2));
        products.add(new Product(2, "Samsung Galaxy Z Fold3", 41_000_000, "Samsung", 3));
        products.add(new Product(3, "IPhone 11", 12_000_000, "Apple", 1));
        products.add(new Product(4, "OPPO Find X3 Pro", 19_500_000, "Oppo", 5));
        products.add(new Product(5, "Xiaomi 11T", 9_500_000, "Xiaomi", 7));
        products.add(new Product(6, "Vivo V21", 23_500_000, "Vivo", 6));

        ProductService productService = new ProductService();

        // 1. In ra thông tin sản phẩm
        productService.print(products);
        System.out.println();

        //2. Tính tổng các sản phẩm
        int totalMoney = productService.getTotalMoney(products);
        System.out.println(totalMoney);
        System.out.println();

        // Nên lấy ra 1 List<>
        // 3. Tìm sản phẩm theo tên thương hiệu
        productService.getProductByBrand(products, "Apple").forEach(p -> p.printInfo());
        System.out.println();

        // 4. Tìm sản phẩm theo giá
        productService.getProductByPrice(products, 20_000_000).forEach(p -> p.printInfo());
        System.out.println();

        // 5. Tìm các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường)
        productService.getProductByName(products, "pro").forEach(p -> p.printInfo());
        System.out.println();

        // 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product

        // 7. Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng

        // 8. Sắp xếp giỏ hàng theo price tăng dần

        // 9. Sắp xếp giỏ hàng theo count giảm dần

        // 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
    }
}
