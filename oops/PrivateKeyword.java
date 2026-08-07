package oops;
class Student{
        String name;
        private int rno;
        double cgpa;
        void print(){
            System.out.println(name + " "+rno+ " "+cgpa);
        }
        void setRno(int x){
            rno = 91;
        }
        int getRno(){
            return rno;
        }
    }
public class PrivateKeyword {
    // public static void Change(Student s){
    //     s.rno = 90;
    // }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mukesh";
        // s.rno = 91;
        s.cgpa = 8.29;
        // Change(s);
        s.getRno();
        s.setRno(91);
        s.print();
    }
}
