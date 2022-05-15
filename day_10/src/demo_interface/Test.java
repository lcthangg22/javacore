package demo_interface;


import demo_abstract.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo interface từ class Rectangle đã implement
        IShape shape = new Rectangle(4, 5);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        shape.printInfo();

        // Khởi tạo interface từ class Square đã implement
        IShape shape1 = new Square(4);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        shape.printInfo();

        // Khởi tạo 1 danh sách IShape
        ArrayList<IShape> iShapes = new ArrayList<>();
        iShapes.add(shape);
        iShapes.add(shape1);
        iShapes.add(new Rectangle(5, 6));
        iShapes.add(new Square(5));

//        for (IShape iShape : iShapes) {
//            System.out.println("Tính = " + iShape.getArea());
//        }

        // Sắp sếp diện tích HCN giảm dần
        ArrayList<IShape> hcn = new ArrayList<>();
        for (IShape iShape : iShapes) {
            if (iShape instanceof Rectangle) {
                hcn.add(iShape);
            }

        }

        iShapes.sort(new Comparator<IShape>() {
            @Override
            public int compare(IShape o1, IShape o2) {
                return (int) (o2.getArea() - o1.getArea());
            }
        });
        for (IShape iShape1: iShapes) {
            System.out.println(" Tính = " + iShape1.getArea());
        }

//        // Gọi phương thức của interface
//        IShape.display();
//        System.out.println(IShape.name);
//
//        shape.getSide(); // Rectangle
//        shape1.getSide(); // Square
    }
}
