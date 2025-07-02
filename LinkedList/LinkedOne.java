package LinkedList;

public class LinkedOne {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode = new Node(data);
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
    public void add(int idx,int data){
        Node newNode = new Node(data);

        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedOne ll = new LinkedOne();
        ll.addFirst(1);
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.print();
        // ll.print();
       ll.add(2, 11);
       ll.print();


        
    }
}
