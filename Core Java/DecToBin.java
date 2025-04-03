public class DecToBin {

    public static int DecToBinary(int n){
        int pow=0;
        int BinNum=0;
        int myNum=n;
        int rem=0;
        while(n>0){
            rem=n%2;
            BinNum=BinNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n=n/2;
         
        }
        return BinNum;
    }
    public static void main(String args[]){
        int n=7;
        int BinResult = DecToBinary(n);
        System.out.println("Decimal No : "+ n +" Binary No is : "+ BinResult);
    }
}
