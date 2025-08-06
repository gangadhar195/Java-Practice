import java.util.*;

public class BinaryBasic {

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node builderTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builderTree(nodes);
            newNode.right = builderTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                System.out.print(root+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree=new BinaryTree();
        Node root = tree.builderTree(nodes);
        System.out.println("Root Node is: " + root.data);
        tree.preorder(root);
    }
}

