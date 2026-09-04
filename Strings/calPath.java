package Strings;

public class calPath {
    public static void shortPath(String str){
        int x = 0 , y = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'N') y++;
            else if(str.charAt(i) == 'S') y--;
            else if(str.charAt(i) == 'E') x--;
            else x++;
        }
        int X2 = x*x;
        int Y2 = y*y;
        int SD = (int)Math.sqrt(X2 + Y2);
        System.out.println(SD);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortPath(str);
    }
}
