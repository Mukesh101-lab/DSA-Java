class Node{
    int val;
    Node next;

    void print(){
        System.out.println(val + " "+next);
    }
}

public class IdeaOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node();
        a.val = 2;
        Node b = new Node();
        a.next = b;
        b.val = 4;
        a.print();
        b.print();


    }
}
