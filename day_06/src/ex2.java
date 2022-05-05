import java.util.StringTokenizer;

public class ex2 {
    public static void main(String[] args) {
        demTu("Hello World!");
    }
    public static void demTu(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        System.out.println("Số từ có trong chuỗi " + str + " = " + soTuTrongChuoi);
//        int result;
        char kyTu = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
//                result = str.indexOf(kyTu) + 1;
                System.out.println("Ký tự " + kyTu + " xuất hiện tại vị trí: " + i);
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + str + " = " + count);

    }
}
