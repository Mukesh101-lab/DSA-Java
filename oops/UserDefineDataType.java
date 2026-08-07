package oops;

public class UserDefineDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+ " "+rno +" "+cgpa);
        }
    }

    public static void Change(Student s2){
        s2.rno = 81;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mukesh";
        s1.rno = 91;
        s1.cgpa = 8.29;

        Student s2 = new Student();
        s2.name = "Kishan";
        s2.rno = 80;
        s2.cgpa = 8.7;
        s1.print();
        Change(s2);
        s2.print();
        // System.out.println(s1.name);


    }
}
