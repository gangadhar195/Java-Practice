package Assignments;

public class Practics {

    public static void reverseString(String str){
        StringBuilder newstr = new StringBuilder();
        System.out.println("old String : "+str);
        for(int i=str.length()-1;i>=0;i--){
            newstr.append(str.charAt(i));
        }
        System.out.println("Reverse String : "+newstr);

    }

    public static boolean checkprime(int n){
        for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }
                
            }
            return true;
    }
    public static void main(String args[]){
        // String str = "sunday";
        // String rev = "";

        // System.out.println("old String : "+str);
        // for(int i=str.length()-1;i>=0;i--){
        //     rev += str.charAt(i);
        // }
        // System.out.println("Reverse String : "+rev);

        // reverseString(str);

            int n =7;
            
            checkprime(n);
            System.out.println(checkprime(n));

    }
}
