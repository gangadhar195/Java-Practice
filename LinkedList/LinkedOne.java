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
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;

        head=newNode;
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int idx,int data){

        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int iterSearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public void deleteNthNode(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itoIdx=sz-n;
        Node prev=head;
        while(i<itoIdx){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

        Node midNode=findMid(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;

        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        // System.out.println(size);
    }
    public static void main(String args[]){
        LinkedOne ll = new LinkedOne();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
    //     // ll.print();
        ll.addLast(1);
    //     // ll.print();
        // ll.addLast(4);
        // ll.addLast(5);
        ll.print();
    //     // ll.print();
    //    ll.add(2, 11);
    //    ll.print();
    //    ll.removeFirst();
    //    ll.print();
    //    ll.removeLast();
    //    ll.print();
    //    System.out.println(ll.iterSearch(3));
    //    System.out.println(ll.iterSearch(10));
    // System.out.println(ll.recSearch(4));
    // System.out.println(ll.recSearch(10));
    // ll.reverse();
    // ll.deleteNthNode(2);
    System.out.println(ll.isPalindrome());
        // ll.print();
    // System.out.println(ll.size);

        
    }
}
