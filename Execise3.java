

import java.util.Locale;
import java.util.Scanner;

public class Execise3 {
    public static void standardized(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String str[] = s.split(" ");
        s = "";
        for (int i = 0; i < str.length; ++i) {
            s += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1).toLowerCase();
            if (i < str.length - 1) {
                s += " ";
            }
        }
        System.out.println(s);


    }

    public static void main(String[] args) {
        System.out.print("Mời bạn nhập vào chuỗi cần chuẩn hóa : ");
        String s = new Scanner(System.in).nextLine();

        standardized(s);
    }
}
