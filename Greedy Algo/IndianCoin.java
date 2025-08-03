import java.util.*;
public class IndianCoin {
    public static void main(String arg[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 1059;
        int CountofCoins=0;
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    CountofCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("Number of Coins Count : "+CountofCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
