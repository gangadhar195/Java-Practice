import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }
    public static void main(String args[]){
        String str="Gangadhar";
        System.out.println(reverseString(str));
    }
}
