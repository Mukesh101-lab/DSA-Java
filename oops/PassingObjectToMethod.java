package oops;

public class PassingObjectToMethod {
    public static class Car{
        int Price;
        String Name;
        double length;
        int Seats;
    }

    public static void Change(Car c){
        c.Seats = 5;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.Name = "BMW";
        c.Price = 10000000;
        c.Seats = 4;
        c.length = 3.25;

        Change(c);
        System.out.println(c.Seats);

    }
}
