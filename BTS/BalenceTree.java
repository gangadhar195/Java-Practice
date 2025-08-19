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
     public static void main(String args[]){
        int arr[] = {3,5,6,8,10,11,12};

       Node root= createBalenceTree(arr,0,arr.length-1);
       preorder(root);
       
     }
}
