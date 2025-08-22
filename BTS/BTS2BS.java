public class BTS2BS {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        boolean isBTs;
        int size;
        int min;
        int max;
        public Info(boolean isBTs,int min,int max,int size){
            this.isBTs=isBTs;
            this.min=min;
            this.max=max;
            this.size=size;
        }
    }
    public static int maxBTs = 0;
    public static Info largestBTS(Node root){
        if(root == null){
            return new Info(true, Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        Info leftInfo = largestBTS(root.left);
        Info rightInfo = largestBTS(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.min(leftInfo.max, rightInfo.max));
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, min, max, size);
        }
        if(leftInfo.isBTs && rightInfo.isBTs){
            maxBTs = Math.max(maxBTs, size);
            new Info(true, min, max, size)
        }
        return new Info(false, min, max, size);
    }
    public static void main(String args[]){
        Node root= new Node(50);
        root.left= new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        largestBTS(root);
    }
}
