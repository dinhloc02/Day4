
public class Execise1 {
    public static boolean checkreversible(int number){
        String temp = Integer.toString(number);
       int n = temp.length();
        for(int i=0;i<temp.length()/2;++i){
            if(temp.charAt(i)!=temp.charAt(--n)){

             return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
       for(int i=100001;i<999999;++i){
           if(checkreversible(i)){
               System.out.println(i);
           }
       }
    }
}
