import java.util.*;

public class RotatePaire2 {

    public static boolean rotatetwoPaire(ArrayList<Integer> list,int target){
        int n=list.size();
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int rp=bp;
        int lp=bp+1;
        while (lp!=rp) {
            if(list.get(rp)+list.get(lp)==target){
                System.out.println(list.get(lp)+" "+list.get(rp));
                return true;
            }

            if(list.get(rp)+list.get(lp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=14;
        // rotatetwoPaire(list,target);
        System.out.println(rotatetwoPaire(list, target));

    }
}
