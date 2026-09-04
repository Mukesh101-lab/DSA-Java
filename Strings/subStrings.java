package Strings;

public class subStrings {
    public static void printSubString(String str, int st , int end){
        String subStr = "";
        for(int i=st;i<end;i++){
            subStr += str.charAt(i);
        }
        System.out.println(subStr);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        printSubString(str, 1, 5);
    }
}
