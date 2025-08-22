import java.util.ArrayList;

public class BalenceTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
   public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node createBalenceTree(int arr[],int start,int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBalenceTree(arr, start, mid-1 );
        root.right = createBalenceTree(arr, mid+1, end);
        return root;
    }
       public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
      public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left= insert(root.left, val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void getInorder(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
         getInorder(root.left, inorder);
        inorder.add(root.data);
         getInorder(root.right, inorder);
    }
    public static Node createBTS(ArrayList<Integer> inorder,int st,int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBTS(inorder, st, mid-1);
        root.right = createBTS(inorder, mid+1, end);
        return root;
    }
    public static Node BTS2BalanceTree(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);
        // BTSTree
        root = createBTS(inorder, 0, inorder.size()-1);
        return root;
    }
     public static void main(String args[]){
        // int arr[] = {3,5,6,8,10,11,12};
        // int values[] = {1,5,3,8,4,6,10,11,14};
        // Node root=null;
        // for(int i=0;i<values.length;i++){
        //    root= insert(root, values[i]);
        // }
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = BTS2BalanceTree(root);
    //    Node root= createBalenceTree(arr,0,arr.length-1);
       preorder(root);
       
     }
}
