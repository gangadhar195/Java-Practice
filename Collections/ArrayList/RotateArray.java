import java.util.ArrayList;

public class RotateArray {

    public static int findIndexOfrotateArray(ArrayList<Integer>list,int target){
        int n=list.size();
        int bp=-1;
        //list is empty
        if(list == null || n==0){
            System.out.println("Array is empty");
            return -1;
        }

         //find breaking index
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        //list find target with linear search
        if(bp==-1){
        for(int i=0;i<n;i++){
            if(list.get(i)==target){
                // System.out.println(list.get(i));
                return i;
            }
        }
        return -1;
    }
       
        //find star and end index
        int lp=(bp+1)%n;
        int rp=bp;

        for(int i=0;i<n-1;i++){
            if(list.get(lp)==target) return lp;
            if(list.get(rp)==target) return rp;

            if(list.get(lp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(4);
        // list.add(5);
        // list.add(6);
        // list.add(7);
        // list.add(0);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        int target = 4;
        // findIndexOfrotateArray(list,target);
        System.out.println(findIndexOfrotateArray(list,target));


    }
}
