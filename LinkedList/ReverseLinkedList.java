package LinkedList;

public class ReverseLinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
       
        }
         public static Node head;
        public static Node tail;

        public static void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static void reverseNode(){
            Node prev=null;
            Node curr=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }

        public static int removeFirst(){
            Node temp=head;
            int sz=0;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(sz==0){
                System.out.println("ll is empty");
                return Integer.MAX_VALUE;
            }else if(sz==1){
                int val=head.data;
                head=tail=null;
                return val;
            }
            int val=head.data;
            head=head.next;
            sz--;
            return val;
        }
        public static void print(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    public static void main(String args[]){
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.reverseNode();
        ll.print();
        ll.removeFirst();
        ll.print();

    }
}
