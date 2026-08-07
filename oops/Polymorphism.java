package oops;

public class Polymorphism {
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class Dog{
        void speak(){
            System.out.println("Bhow Bhow");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Dog d = new Dog();
        Cat c = new Cat();
        h.speak();
        d.speak();
        c.speak();
    }
}
