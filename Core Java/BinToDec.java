public class BinToDec {

    public static int BinToDecimal(int BinNum){
        int pow=0;
        int last=0;
        int DeNum=0;
        int myNum=BinNum;
        while (BinNum>0) {
            last = BinNum %10;
            DeNum = DeNum + (last * (int)Math.pow(2, pow));
            pow++;
            BinNum=BinNum/10;
        }
        return DeNum;
    }
    public static void main(String args[]){
        int BinNum = BinToDecimal(111);
        System.out.println("Binary No :"+BinNum);
    }
}
