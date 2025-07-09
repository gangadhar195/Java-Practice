import java.util.*;
public class StockSpan{

    public static void stockprice(int stack[],int span[]){
        Stack<Integer> s= new Stack<>();
        span[0]=1;
        s.push(0); 
        for(int i=1;i<stack.length;i++){
            int curr=stack[i];
            while(!s.isEmpty() && curr>stack[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                stack[i]=i+1;
            }else{
                int prevHigh =s.peek();
                span[i]=i-prevHigh; 
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stock[]={100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        stockprice(stock,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}