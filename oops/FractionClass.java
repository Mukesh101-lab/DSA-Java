package oops;

class Fraction{
    int x;
    int y;
    
    Fraction(int x , int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println(x + " / " + y);
    }

    void add(Fraction f2){
        x = x * f2.y + f2.x * y;
        y = y + f2.y;
    }

    void div(Fraction f3){
        x = x * f3.y;
        y = y * f3.x;
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 7);
        f1.print();

        Fraction f2 = new Fraction(7, 3);
        f1.add(f2);
        f1.print();
        Fraction f3 = new Fraction(7, 3);
        f1.div(f3);
        f1.print();

    }
}
