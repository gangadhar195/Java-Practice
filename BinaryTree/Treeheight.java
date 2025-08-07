import java.util.*;

// import BinaryTree;
public class Treeheight {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class BinaryTreeH{
        static int idx=-1;
        public static Node builderTree(int nodes[]){
            idx++;
            if(idx>=nodes.length){
                return null;
            }
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=builderTree(nodes);
            newNode.right=builderTree(nodes);
            return newNode;

        }
        public static int TreeH(Node root){
            if(root==null){
                return 0;
            }
            int height=0;
            int lh=TreeH(root.left);
            int rh=TreeH(root.right);
             return Math.max(lh, rh)+1;
            // System.out.println("Tree Height : "+ height);
        }
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int leftcount = count(root.left);
            int rightcount = count(root.right);
            int totalNode = leftcount + rightcount +1;
            return totalNode;
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTreeH tree = new BinaryTreeH();
        Node root = tree.builderTree(nodes);
       int height= tree.TreeH(root);
       System.out.println("Height : "+height);
       System.out.println("Total Node Count : "+tree.count(root));
    }
}
