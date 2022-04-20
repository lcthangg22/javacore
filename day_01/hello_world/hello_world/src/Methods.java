public class Methods {
    public static void main(String[] args) {
 Methods m = new Methods();
 m.sayhello();
        m.sayHelloWithName(" Luong Thang "); // Argument: Đối số
        int data = m.sum( 10, 20);
        System.out.println(data);
        int data1 = m.sum(data, 70);
        System.out.println(data1);
        System.out.println(m.sum(  3, 4));
// Methods m1 = new Methods();
// m1.sayhello();
    }
    public static void sayhello() {
        System.out.println("Xin chào các bạn");
    }
    public void sayHelloWithName(String name) { // name: Parameter : Tham số
        System.out.println("Xin chào" + name );
    }

    public int sum(int a, int b) {
//        int data = a + b;
//        return data;
         return a + b;
    }
}
