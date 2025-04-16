package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println("Deleted : "+stack.pop());
        System.out.println("Last Item : "+stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);

    }
}
