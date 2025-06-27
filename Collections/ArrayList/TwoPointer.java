import java.util.ArrayList;

public class TwoPointer {

    public static void twopointer(ArrayList<Integer> height){
        int MaxWater=0;
        int Rp= height.size()-1;
        int Lp = 0;
        while(Lp<Rp){
            int ht=Math.min(height.get(Lp),height.get(Rp));
            int width= Rp-Lp;
             int currWater = ht*width;
             MaxWater=Math.max(MaxWater, currWater);
            if(Lp<Rp){
                Lp++;
            }else{
                Rp--;
            }
        }
        System.out.println("Maximum Water : "+MaxWater);
    }
     public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        twopointer(height);
}
}
