public class CycleNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // public static void addFirst(int data) {
    //     Node newNode = new Node(data);

    //     if (head == null) {
    //         // System.out.println("ll is empty");
    //         head = tail = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }

    // public static void addLast(int data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = tail = newNode;
    //         return;
    //     }
    //     tail.next = newNode;
    //     tail = newNode;
    // }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean isCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
                break;
            }

        }
        if(isCycle==false){
            return;
        }
        Node prev=null;
        slow=head;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    } 
    public static void print(){
       Node temp=head;
       while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
       }
       System.out.println("null");

    }

    public static void main(String args[]) {
        // CycleNode ll = new CycleNode();
        // ll.addFirst(1);
        // ll.addLast(5);
        // ll.print();
        head = new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        print();
    }
}
