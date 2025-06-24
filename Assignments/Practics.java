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
    public static void main(String args[]){
        String str = "sunday";
        // String rev = "";

        // System.out.println("old String : "+str);
        // for(int i=str.length()-1;i>=0;i--){
        //     rev += str.charAt(i);
        // }
        // System.out.println("Reverse String : "+rev);

        reverseString(str);
    }
}
