import java.util.ArrayList;
import java.util.Collections;

public class PaireSum2 {

    public static void sumoftwo(ArrayList<Integer> list, int target) {
        int sum = 0;
        int j;
        for (int i = 0; i < list.size(); i++) {
            for (j = i+1; j < list.size(); j++) {
                sum = list.get(i) + list.get(j);
                if (sum == target) {
                    System.out.println(list.get(i) + " " + list.get(j));
                    return;
                }
            }

        }
    }

    public static boolean twopointerApproch(ArrayList<Integer> list,int target){
        int Lp=0,Rp=list.size()-1;
        int sum=0;
        while(Lp!=Rp){
            sum=list.get(Lp)+list.get(Rp);
            if(sum==target){
                // System.out.println(list);
                System.out.println(list.get(Lp)+" "+ list.get(Rp));
                return true;
            }else if(sum<target){
                Lp++;
            }else{
                Rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        // sumoftwo(list, target);
        // twopointerApproch(list,target);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(twopointerApproch(list, target));
        // System.out.println(list);

    }
}
