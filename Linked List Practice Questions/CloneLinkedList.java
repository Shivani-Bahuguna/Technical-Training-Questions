
import java.io.*;
import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node arbit;


    Node(int x)
    {
        this.val = x;
        this.next = null;
        this.arbit = null;
    }
}

class GFG {

    static Node cloneLinkedList(Node head)
    {

        HashMap<Node, Node> mp = new HashMap<>();
        Node temp, nhead;


        temp = head;
        nhead = new Node(temp.val);
        mp.put(temp, nhead);


        while (temp.next != null) {
            nhead.next = new Node(temp.next.val);
            temp = temp.next;
            nhead = nhead.next;
            mp.put(temp, nhead);
        }
        temp = head;


        while (temp != null) {
            mp.get(temp).arbit = mp.get(temp.arbit);
            temp = temp.next;
        }


        return mp.get(head);
    }

    static void printList(Node head)
    {
        System.out.print(head.val + "(" + head.arbit.val
                + ")");
        head = head.next;
        while (head != null) {
            System.out.print(" -> " + head.val + "("
                    + head.arbit.val + ")");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.arbit = head.next.next;
        head.next.arbit = head;
        head.next.next.arbit = head.next.next.next.next;
        head.next.next.next.arbit = head.next.next;
        head.next.next.next.next.arbit = head.next;


        System.out.println("The original linked list:");
        printList(head);


        Node sol = cloneLinkedList(head);

        System.out.println("The cloned linked list:");
        printList(sol);
    }
}



