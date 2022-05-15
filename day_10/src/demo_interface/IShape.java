package demo_interface;

public interface IShape {
    // variable : public, final, static
    String name = "Shape";

    // Phương thức abstract
    double getArea();
    double getPerimeter();
    void printInfo();

    // Default method
    default void getSide() {
        System.out.println("Shape have many side ...");
    }

    // Static method
    static void display() {
//        name = "Other name"; Không thể gán giá trị -> lỗi
        System.out.println("Hi, my name is " + name);
    }
}
