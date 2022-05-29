import java.util.Scanner;

public class Execise5 {
    public static void changeName(String str){
        str =str.trim().replaceAll("\\s+"," ");
      String s[] = str.split(" ");
      String Name = s[s.length-1];
    for(int i=0;i<s.length-1;++i){
        Name+=" "+s[i];
    }
        System.out.println(Name);

    }

    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần thay đổi:");{
            String str = new Scanner(System.in).nextLine();
            changeName(str);
        }
    }
}
