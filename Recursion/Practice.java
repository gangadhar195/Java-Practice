public class Practice {
    public static void DecreasingOrder(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
            System.out.print(n+" ");
         DecreasingOrder(n-1);
    }
    public static void main(String args[]){
        int n =10;
        DecreasingOrder(n);
        // System.out.println(DecreasingOrder(n));
    }
}
