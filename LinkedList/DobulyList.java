public class DobulyList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node prev;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
    }

    public static int removeFrist() {
        if (head == null) {
            head = tail = null;
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static int removeLast() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int val = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;

    }

    public void ReverDoublyLL(){
        
        if(head==null){
            System.out.println("DoublyLL is empty");
            head=tail=null;
        }
        // if(head==tail){
        //     head=tail;
        //     return;
        // }
        Node curr=head;
        Node next;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DobulyList dll = new DobulyList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        // System.out.println(dll.removeFrist());
        // dll.print();
        // System.out.println(dll.removeLast());
        // dll.print();
        dll.ReverDoublyLL();
        dll.print();
    }
}
