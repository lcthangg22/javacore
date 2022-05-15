package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    private void printMenu() {
        System.out.println("******** MENU ********");
        System.out.println("1. Xem danh sách sản phẩm");
        System.out.println("2. Tìm sản phẩm theo tên");
        System.out.println("3. Tìm sản phẩm theo id");
        System.out.println("4. Tìm sản phẩm có số lượng dưới 5");
        System.out.println("5. Tìm sản phẩm theo mức giá");
        System.out.println("6. Thoát\n");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        int option;
        while (isContinue) {
            printMenu();
            System.out.println("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Danh sách sản phẩm : ");
                    ArrayList<Product> products = productService.getProducts();
                    productService.printInfo(products);
                    break;
                }
                case 2: {
                    System.out.print("Nhập tên : ");
                    String name = sc.nextLine();
                    ArrayList list = productService.findByName(name);
                    if (list.isEmpty()) {
                        System.out.println("Không có sản phẩm nào có tên là " + name + " trong danh sách!");
                    } else {
                        System.out.println("Sản phẩm có tên " + name + " bao gồm : ");
                        productService.printInfo(list);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Nhập id : ");
                    int id = Integer.parseInt(sc.nextLine());
                    Product product = productService.findById(id);
                    if (product == null) {
                        System.out.println("Không tìm thấy sản phẩm với id là : " + id);
                    } else {
                        System.out.println(product);
                        boolean isContinueSub = true;
                        int option1;
                        while (isContinueSub) {
                            System.out.println("1. Xóa sản phẩm ");
                            System.out.println("2. Cập nhật số lượng sản phẩm");
                            System.out.println("3. Thoát\n");
                            System.out.print("Nhap lua chon: ");
                            option1 = Integer.parseInt(sc.nextLine());
                            switch (option1) {
                                case 1: {
                                    productService.deleteProduct(product.getId());
                                    System.out.println("Xóa thành công!");
                                    break;
                                }
                                case 2: {
                                    Product product1 = productService.setProduct(product);
                                    System.out.println("Cập nhật thành công!");
                                    System.out.println(product1);
                                    break;
                                }
                                case 3: {
                                    isContinueSub = false;
                                    break;
                                }
                                default: {
                                    System.out.println("Lựa chọn không phù hợp!");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    ArrayList<Product> list = productService.findByQuantity(5);
                    productService.printInfo(list);
                    break;
                }
                case 5: {
                    boolean isContinueSub = true;
                    int option2;
                    while (isContinueSub) {
                        System.out.println("1. Tìm sản phẩm có mức giá dưới 50.000");
                        System.out.println("2. Tìm sản phẩm có mức giá từ 50.000 đến 100.000");
                        System.out.println("3. Tìm sản phẩm có mức giá trên 100.000");
                        System.out.println("4. Thoát");
                        System.out.print("Nhập lựa chọn : ");
                        option2 = Integer.parseInt(sc.nextLine());
                        switch (option2) {
                            case 1: {
                                ArrayList<Product> list = productService.findByPrice1();
                                if (list.isEmpty()) {
                                    System.out.println("Không có sản phẩm có mức giá phù hợp!");
                                } else {
                                    productService.printInfo(list);
                                }
                                break;
                            }
                            case 2: {
                                ArrayList<Product> list = productService.findByPrice2();
                                if (list.isEmpty()) {
                                    System.out.println("Không có sản phẩm có mức giá phù hợp!");
                                } else {
                                    productService.printInfo(list);
                                }
                                break;
                            }
                            case 3: {
                                ArrayList<Product> list = productService.findByPrice3();
                                if (list.isEmpty()) {
                                    System.out.println("Không có sản phẩm có mức giá phù hợp!");
                                } else {
                                    productService.printInfo(list);
                                }
                                break;
                            }
                            case 4: {
                                isContinueSub = false;
                                break;
                            }
                            default: {
                                System.out.println("Lựa chọn không phù hợp!");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp!");
                    break;
                }
            }
        }
    }
}