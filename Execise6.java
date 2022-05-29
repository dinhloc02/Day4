import java.util.Scanner;

public class Execise6 {
    public static void sortAlb(String str) {
        str =str.trim().replaceAll("\\s+"," ");
        String s[] = str.split(" ");
        String temp = "";
        for (int i = 0; i < s.length - 1; ++i) {
            for (int j = i + 1; j < s.length; ++j) {
                if (s[i].compareTo(s[j]) > 0) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (String ss :s){
            System.out.println(ss);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần chuyển đổi(Không quá 20 từ mỗi từ không quá 10 kí tự)");
        int n=0;
        String str;
        int temp=0;
        do{
             str = new Scanner(System.in).nextLine();
            String s[] = str.split(" ");
            n=s.length;

            for(int i=0;i<n;++i){
                temp= s[i].length();
                if(temp>10){
                   break;
                }
            }
            if(temp>10||n>20){
                System.out.println("Nhập lại(Không quá 20 từ mỗi từ không quá 10 kí tự):");

            }        }while (n>20||temp>10);
       sortAlb(str);

    }
}
