import java.util.*;
public class Parenthesis {

    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() =='(' && ch==')')
                 || (s.peek()=='{' && ch=='}')
                 ||(s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
            if(s.isEmpty()){
                return true;
            }else{
                return false;
            }
        
    }

    public static boolean isDublicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek() !='('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // dublicate
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        // String str = "({}){[]}";

        String str="((a+b))";
        // System.out.println(isValid(str));
        System.out.println(isDublicate(str));
    }
}
