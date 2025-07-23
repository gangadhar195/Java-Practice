import java.util.*;
public class StackBasic {
    public static void findHistogram(int arr[]){
        int MaxReactangle=0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s= new Stack<>();
        //small right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //small left
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=arr.length;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current max
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currMax= height*width;
            MaxReactangle= Math.max(MaxReactangle, currMax);
        }
        System.out.println("Maximum Reactangle : "+MaxReactangle);
    }

    public static void MinHistogram(int arr[]){
        int mincurr=0;
        int nrl[] = new int[arr.length];
        int nrr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        //large right
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nrr[i]=-1;
            }else{
                nrr[i]=s.peek();
            }
            s.push(i);
        }
        //heightest left
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nrl[i]=-1;
            }else{
                nrl[i]=s.peek();
            }
            s.push(i);
        }
        //currmin
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nrr[i]-nrl[i]-1;
            int currmin = height*width;
            mincurr = Math.min(mincurr, currmin);
        }
        System.out.println("Min Histogram : "+ mincurr);
    }
    public static void main(String args[]){
        int arr[] = {2,1,4,6,2,3};
        // findHistogram(arr);
        MinHistogram(arr);

    }
}
