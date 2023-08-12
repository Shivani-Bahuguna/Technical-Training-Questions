import java.util.*;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Main
{


    static void AlternatingSplit(Node source, Node[] aRef, Node[] bRef) {
        Node a = null, b = null;
        Node current = source;
        int count = 0;

        while (current != null) {
            if (count % 2 == 0) {

                if (a == null) {
                    aRef[0] = current;
                    a = current;
                } else {
                    a.next = current;
                    a = a.next;
                }
            } else {

                if (b == null) {
                    bRef[0] = current;
                    b = current;
                } else {
                    b.next = current;
                    b = b.next;
                }
            }
            current = current.next;
            count++;
        }

        if (a != null) {
            a.next = null;
        }

        if (b != null) {
            b.next = null;
        }
    }


    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String[] args)
    {


        Node head = null;


        for (int i = 5; i >= 0; i--) {
            Node newNode = new Node(i);
            newNode.next = head;
            head = newNode;
        }

        System.out.print("Original linked List: ");
        printList(head);

        Node[] aRef = new Node[1];
        Node[] bRef = new Node[1];


        AlternatingSplit(head, aRef, bRef);

        System.out.print("\nResultant Linked List 'a': ");
        printList(aRef[0]);

        System.out.print("\nResultant Linked List 'b': ");
        printList(bRef[0]);
    }
}