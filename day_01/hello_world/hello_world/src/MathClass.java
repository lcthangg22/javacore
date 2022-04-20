public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-8));
        System.out.println(Math.abs(8));

//        Làm tròn xuống
        System.out.println(Math.floor(1.9));
        System.out.println(Math.floor(1.1));

//        Làm tròn lên
        System.out.println(Math.ceil(1.9));
        System.out.println(Math.ceil(1.1));

//        Làm tròn bình thường
        System.out.println(Math.round(1.9));
        System.out.println(Math.round(1.1));

//        Căn
        System.out.println(Math.pow(2, 4));

//        Căn bậc hai
        System.out.println(Math.sqrt(9));

//        Random
        System.out.println(Math.random());  // random 1 số trong khoảng (0, 1)

        //  Random 1 số trong khoảng từ 0 -> 10
        int randomNumber = (int) Math.floor( Math.random() * 11);
        System.out.println(randomNumber);
// Math.random() * (max-min+1) + min
        //  Random 1 số trong khoảng từ 10 -> 100
        int randomNumber1 = (int) Math.floor( Math.random() * (100 - 10 + 1) +10);
        System.out.println(randomNumber);
    }
}
