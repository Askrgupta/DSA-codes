// import java.util.*;
public class buysellstock {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));

    }
    public static int buyAndSellStock(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){//profit
                int profit = prices[i]-buyPrice;//today's profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
}
