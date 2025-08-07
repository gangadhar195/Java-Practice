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

        public static int sumofNode(Node root){
            if(root==null){
                return 0;
            }
            int leftsum = sumofNode(root.left);
            int rightSum = sumofNode(root.right);
            int totalsum = leftsum + rightSum + root.data;
            return totalsum;
        }
        public static int diameter2(Node root){
            if(root == null){
                return 0;
            }
            int leftdiameter = diameter2(root.left);
            int lh = TreeH(root.left);
            int rightdiameter = diameter2(root.right);
            int rh = TreeH(root.right);
            int selfdiameter = rh + lh+1;
            int findlegth = Math.max(selfdiameter,Math.max(rightdiameter, leftdiameter));
            return findlegth;
        }
        static class Info{
            int diam;
            int ht;
            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
        }
        public static Info daimeter(Node root){
            if(root==null){
                return new Info(0, 0);
            }
            Info leftdiam = daimeter(root.left);
            Info rightdiam = daimeter(root.right);
            int daim = Math.max(Math.max(leftdiam.diam, rightdiam.diam), leftdiam.ht+rightdiam.ht+1);
            int ht = Math.max(leftdiam.ht, rightdiam.ht) +1;
            return new Info(daim, ht);
        }

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,7,-1,-1,8,-1,-1,5,-1,-1,3,-1,6,-1,9};
        BinaryTreeH tree = new BinaryTreeH();
        Node root = tree.builderTree(nodes);
       int height= tree.TreeH(root);
       System.out.println("Height : "+height);
       System.out.println("Total Node Count : "+tree.count(root));
       System.out.println("Total sum of Node : "+tree.sumofNode(root));
       System.out.println("Total sum of Node : "+tree.diameter2(root));
       System.out.println("Diameter of Tree : "+tree.daimeter(root).diam);
       System.out.println("Height of Tree : "+tree.daimeter(root).ht);


    }
}
