public class ReverseNo {
    public static void main(String args[]){
        int n=123456;
        int lastno=0;
        int rev=0;
        // while(n>0){
        //     lastno = n%10;
        //     System.out.print(lastno);
        //     n=n/10;
        // }

        while (n>0) {
            lastno = n%10;
            rev = (rev*10)+lastno;
            n=n/10;
        }
        System.out.println(rev);

    }
}
