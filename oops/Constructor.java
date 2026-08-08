package oops;

public class Constructor {
    public static class Student{
        String name;
        private int rno;
        double cgpa;

        Student(String name ,int rno ,double cgpa){
            this.name = name;
            this.rno = rno;
            this.cgpa = cgpa;
        }

        void print(){
            System.out.println(name + " "+rno + " " + cgpa);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Mukesh",91,8.29);
        s1.print();
    }
}
