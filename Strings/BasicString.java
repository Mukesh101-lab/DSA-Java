package Strings;

class BasicString {
    public static void printLetter(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str1 = "abjdhh";
        String str = new String("abcd");
        System.out.println(str1);
        String name = "Mukesh Patel";
        printLetter(name);
    }
}