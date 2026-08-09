class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class DisplayList {
    public static void Display(Node head){
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void DisplayRec(Node head){
        if(head == null) return;
        System.out.println(head.val);
        DisplayRec(head.next);
    }

    public static int get(Node head , int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Display(a);

        // DisplayRec(a
        
        System.out.println(get(a , 2));

    }
}
