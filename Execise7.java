import java.util.Scanner;

public class Execise7 {
    public static void removeStr(String str, String strs) {
        str = str.trim().replaceAll("\\s+", " ");
        String s[] = str.split(" ");
        String strss ="";
        for (int i = 0; i < s.length; ++i) {
            if (s[i].toLowerCase().equals(strs.toLowerCase())) {
                continue;
            }
            strss+=s[i]+" ";
        }
        System.out.println(strss);
    }

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi thứ nhất:");
        String str = new Scanner(System.in).nextLine();
        System.out.println("Nhập chuỗi cần xóa trong chuỗi 1:");
        String strs = new Scanner(System.in).nextLine();
        removeStr(str,strs);
    }
}
