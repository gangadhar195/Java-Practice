import java.util.*;
public class StackAss {
     public static void main(String args[]){
        Stack s = new Stack<>();
        int top[]=new int[3];
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Og Stack : ");
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
            s.push(top);
        }

        if(s.isEmpty()){
            System.out.println(s.push(top));
        }
        System.out.println(s.peek());
    }
}
