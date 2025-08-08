import java.util.*;
public class SubTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node builderTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builderTree(nodes);
            newNode.right = builderTree(nodes);
            return newNode;
        }

        public static boolean isIdentical(Node root, Node subRoot) {
            if (root == null && subRoot == null) return true;
            if (root == null || subRoot == null || root.data != subRoot.data) return false;
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) return false;
            if (isIdentical(root, subRoot)) return true;
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String args[]) {
        int Roottree[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6};
        int Subroot[] = {2, 4, -1, -1, 5, -1, -1};

        BinaryTree.idx = -1;
        Node root = BinaryTree.builderTree(Roottree);

        BinaryTree.idx = -1;
        Node subRoot = BinaryTree.builderTree(Subroot);

        System.out.println(BinaryTree.isSubtree(root, subRoot));  // Output: true
    }
}
