public class BuyAndSell {
    public static void BuyAndSellStock(int stock[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<stock.length;i++){
            if(buyprice < stock[i]){
                int profit = stock[i]-buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyprice=stock[i];
            }
        }
        System.out.println("Profit : "+maxProfit);
    }
    public static void main(String args[]){
        int stock[] = {2,4,5,1,8};
        BuyAndSellStock(stock);
    }
}
