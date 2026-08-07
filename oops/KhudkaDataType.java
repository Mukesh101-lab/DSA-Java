package oops;

public class KhudkaDataType {
    public static class Student {
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mukesh";
        s.rno = 91;
        s.cgpa = 8.29;

        System.out.println(s.name + " "+ s.cgpa + " " + s.rno);
    }
}
