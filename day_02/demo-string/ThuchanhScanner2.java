public class ThuchanhScanner2 {
    public static void main(String[] args) {

        String text = "Xin Chao Cac Ban";
        System.out.println(" In hoa chu: " + text.toUpperCase());
        System.out.println(" In thuong chu: " + text.toLowerCase());
        System.out.println(" Do dai chuoi: " + text.length());
        System.out.println(" Ky tu cuoi cua chuoi: " + text.charAt(text.length() - 1));
        System.out.println(" Cat chuoi : " + text.substring(0,5));
        System.out.println(" Chuoi hello co ton tai trong chuoi ban dau khong: " +text.contains("hello"));

    }
}
