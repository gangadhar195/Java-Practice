package String;

public class FindPalindrome {
        public static boolean isPalindrome(String Num){
            int n = Num.length();
            for(int i=0;i<Num.length()/2;i++){
                if(Num.charAt(i)== Num.charAt(n-1-i)){
                    return false;
                }
            }
            return true;
        }
    public static void main(String args[]){
        String Num = "1234321";

        System.out.println(isPalindrome(Num));
    }
}
