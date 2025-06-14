import java.util.*;


public class QueueExample {
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
    public static void main(String args[]){
    //     PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    // System.out.println(queue.size());
    // queue.add(10);
    // queue.add(20);
    // queue.add(30);
    // queue.add(40);
    // System.out.println(queue.size());
    // System.out.println(queue.peek());
    // System.out.println(queue.poll());
    // System.out.println(queue.size());
    // System.out.println(queue.isEmpty());

    // Queue<Integer> que = new LinkedList<>();
    // System.out.println(que.size());
    // que.add(10);
    // que.add(20);
    // que.add(30);
    // que.add(40);
    // System.out.println(que);
    // System.out.println(que.size());
    // System.out.println(que.peek());
    // System.out.println(que.poll());
    // System.out.println(que);
    
    // add item using for loop
    // Queue<Integer> que = new LinkedList<>();
    // System.out.println(que.size());

    // for(int i=1;i<=10;i++){
    //     que.add(i);
    // }
    // System.out.println(que.size());
    // System.out.println(que);
    // System.out.println(que.peek());
    // System.out.println(que.poll());
    // System.out.println(que);

    Queue<Integer> queue = new ArrayDeque<Integer>();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);
    System.out.println("Orignal Queue : "+ queue);
    reverse(queue);
    System.out.println("Reverse Queue : "+queue);


    }
}
