public class OptimizePower {
    public static int OptimizePow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPow = OptimizePow(a, n/2)* OptimizePow(a, n/2);
        if(n %2 !=0){
            halfPow = a * halfPow;
        }
        return halfPow;
    }
    public static void main(String args[]){
        int a=2;
        int n=5;
        System.out.println(OptimizePow(a,n));
    }
}
