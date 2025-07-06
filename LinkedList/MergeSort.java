import java.util.LinkedList;

public class MergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node merged = new Node(-1);
        Node temp = merged;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return merged.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split into halves
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Sort each half
        Node left = mergesort(head);
        Node right = mergesort(rightHead);

        // Merge sorted halves
        return merge(left, right);
    }

    public static void main(String args[]) {
        MergeSort ll = new MergeSort();
        ll.addFirst(8);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(1);

        System.out.println("Before sorting:");
        ll.print();

        ll.head = ll.mergesort(ll.head);

        System.out.println("After sorting:");
        ll.print();
    }
}

