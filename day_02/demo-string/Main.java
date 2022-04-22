public class Main {
    public static void main(String[] args) {
        // Khai báo theo kiểu literal (giá trị thể hiện chính nó)
        String name = "Thang";
        String name1 = "Thang";

        //  Khởi tạo = tù khóa new -> sinh ra đối tượng
        String message = new String( "Xin chao");
        String message1 = new String("Xin chao");

        System.out.println(name);
        System.out.println(message);

        // So sánh địa chỉ ô nhớ
        // == thường được sử dụng cho kiểu dữ liệu nguyên thủy
        System.out.println(name == name1);
        System.out.println(message == message1);

        // Phương thức so sánh về mặt kí tự
        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));

        // Method String
        String text = "Xin chao cac ban";
        System.out.println(" In hoa chu: " + text.toUpperCase());
        System.out.println(" In thuong chu: " + text.toLowerCase());
        System.out.println(" Do dai chuoi: " + text.length());

        System.out.println(" Ky tu dau cua chuoi: " + text.charAt(0));
        System.out.println(" Ky tu cuoi cua chuoi: " + text.charAt(text.length() - 1));

        System.out.println(" Chuoi hi co chi so bat dau la : " + text.indexOf("hi"));
        System.out.println(" Chuoi ch co chi so bat dau la : " + text.indexOf("ch"));

        System.out.println(" Chuoi hi co ton tai trong chuoi ban dau khong? " +text.contains("hi"));
        System.out.println(" Chuoi ch co ton tai trong chuoi ban dau khong? " +text.contains("ch"));

        System.out.println(" Cat chuoi xin : " + text.substring(0,3));  // từ 0 đến 3
        System.out.println(" Cat chuoi chao cac ban : " +text.substring(4)); // từ 4 trở đi
    }
}
