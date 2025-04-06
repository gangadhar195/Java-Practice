public class TwoSum {
    public static int revesrNo(int n){
        int last=0;
        int  rev=0;
        while(n!=0){
            last=n %10;
            rev = (rev*10)+last;
            n = n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        int n=-1234;

       int reverse= revesrNo(n);
       System.out.println("reverse no : "+reverse);
    }
}
