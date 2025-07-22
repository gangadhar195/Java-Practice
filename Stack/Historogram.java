import java.util.*;
public class Historogram {

    public static void FindMaxhistogram(int arr[]){
        Stack<Integer> s = new Stack<>();
        int maxNumber = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        //find smallest right
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }   
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //smallest left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //find currMax
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currMax= height*width;
            maxNumber = Math.max(currMax, maxNumber);

        }
        System.out.println("Maximum Histogram is : "+ maxNumber);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        FindMaxhistogram(arr);
    }
}
