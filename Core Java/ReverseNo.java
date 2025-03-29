public class ReverseNo {
    public static void main(String args[]){
        int n=123456;
        int lastno=0;
        while(n>0){
            lastno = n%10;
            System.out.print(lastno);
            n=n/10;
        }
    }
}
