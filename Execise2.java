

import java.util.Scanner;

public class Execise2 {
    public static void alter(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122 && i % 2 == 0) {
                charArray[i] -= 32;
            }
           if(charArray[i]>=65&& charArray[i]<=90&&i%2!=0){
               charArray[i]+=32;
           }
        }
       s=String.valueOf(charArray);
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("Mời bạn nhập vào chuỗi:");
        String s = new Scanner(System.in).nextLine();
        alter(s);
    }
}
