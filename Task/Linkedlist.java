class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    Node head;

    void insert(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            return;
        }

        Node t = head;

        while (t.next != null) {
            t = t.next;
        }

        t.next = n;
    }

    void display() {
        Node t = head;

        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(10);
        l.insert(20);
        l.insert(30);

        l.display();
    }
}