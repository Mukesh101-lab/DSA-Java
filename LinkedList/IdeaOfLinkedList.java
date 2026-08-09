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
        a.print();

    }
}
