import java.util.Scanner;

public class Execise4 {
    public static void strMax(String str) {
        str =str.trim().replaceAll("\\s+"," ");
        String s[] = str.split(" ");
        int n[] = new int[s.length];
        int count = 0;
        int max=0;
        int position =0;
        for (int i = 0; i < s.length; ++i) {
            n[i] = s[i].length();
            if(n[i]>max){
                max=n[i];
            }
        }
        for(int i =0;i<n.length;++i){
            if(max==n[i]){
                System.out.println(s[i]+" có độ dài dài nhất");
                System.out.println("vị trí "+ ++position);
                break;
            }
            position+=n[i]+1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần tìm:");
        String str = new Scanner(System.in).nextLine();
        strMax(str);
    }
}
