import java.util.*;
public class NextGreater {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int next[] = new int[arr.length];
        Stack<Integer> s=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i]=-1;
            }else{
                next[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<next.length;i++){
            System.out.print(next[i]+" ");
        }
    }
}
//next greater right change loop i=arr.length-1 to i>=,while condition <=  rightside greater
//next greater left change loop i=0 to i<=arr.lenght-1 leftside greater
//next smallest right chage i=arr.length-1 to i>=while condition >= rightside smallest
//next smallest left change loop i=0 to i<=arr.lenght-1 ,while >=