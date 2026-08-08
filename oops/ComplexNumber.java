package oops;

class CompNumber{
    int  x;
    int y;
    CompNumber(int x , int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println(x + " + i" +y);
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        CompNumber c = new CompNumber(2,3);
        c.print();
    }
}
