package Strings;

public class PrintVowel {
    public static void allVowel(String name){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e'|| name.charAt(i) == 'i' || name.charAt(i) == 'o' ||name.charAt(i) == 'u'){
                System.out.println(name.charAt(i));
            }
        }
    }

    public static void remVowel(String name){
         for(int i=0;i<name.length();i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e'|| name.charAt(i) == 'i' || name.charAt(i) == 'o' ||name.charAt(i) == 'u'){
                // System.out.println(name.charAt(i));
                continue;
            }
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        String name = "Mukesh Patel";
        // allVowel(name);
        remVowel(name);
    }
}
