package Strings;

public class CheckPalindrom {
    public static boolean CheckPalindrom(String str){
        int s = 0 , e = str.length()-1;
        while (s < e) {
            if( str.charAt(s) != str.charAt(e) ){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(CheckPalindrom(str));
    }
}
