package service;

import model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ProductService {
    private ArrayList<Product> products;

    // Khởi tạo data từ constructor
    public ProductService() {
        init();
    }

    // Khởi tạo data
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1, "A", "a", 2, 30000));
        products.add(new Product(2, "B", "b", 4, 60000));
        products.add(new Product(3, "C", "c", 6, 90000));
        products.add(new Product(4, "D", "d", 8, 120000));
    }

    // Trả về danh sách sản phẩm
    public ArrayList<Product> getProducts() {
        return products;
    }

    // Xem danh sách sản phẩm
    public void printInfo(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    // Tìm kiếm theo tên
    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase(Locale.ROOT))) {
                list.add(product);
            }
        }
        return list;
    }

    // Tìm sản phẩm theo id
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Xóa theo id
    public void deleteProduct(int id) {
        // TODO
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
            }
        }
    }

    // Cập nhật số lượng sản phẩm
    public Product setProduct(Product product) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm : ");
        int newQuantity = sc.nextInt();
        product.setQuantity(newQuantity);
        return product;
    }

    // Tìm sản phẩm có số lượng dưới 5
    public ArrayList<Product> findByQuantity(int quantity) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getQuantity() < quantity) {
                list.add(product);
            }
        }
        return list;
    }

    // Tìm sản phẩm theo mức giá
    public ArrayList<Product> findByPrice1() {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 50_000) {
                list.add(product);
            }
        }
        return list;
    }

    public ArrayList<Product> findByPrice2() {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= 50_000 && product.getPrice() <= 100_000) {
                list.add(product);
            }
        }
        return list;
    }

    public ArrayList<Product> findByPrice3() {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 100_000) {
                list.add(product);
            }
        }
        return list;
    }
}
