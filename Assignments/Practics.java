package Assignments;

public class Practics {
    public static void main(String args[]){
        String str = "Java";
        String rev = "";

        System.out.println("old String : "+str);
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("Reverse String : "+rev);
    }
}
