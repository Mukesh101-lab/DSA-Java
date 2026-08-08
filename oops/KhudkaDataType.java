package oops;


public class KhudkaDataType {
    public static class Student {
        String name;
        int rno;
        double cgpa;

        void print(){
            System.out.println(name + " "+ rno +" "+cgpa);
        }
    }

    public static void Change(Student s){
        s.rno = 90;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mukesh";
        s.rno = 91;
        s.cgpa = 8.29;

        s.print();

        // System.out.println(s.name + " "+ s.cgpa + " " + s.rno);

        // Change(s);

        // System.out.println(s.name + " "+ s.cgpa + " " + s.rno);

    }
}
