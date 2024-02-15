class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        int pt=0;

        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            pt=prices[i]-min;
            if(pt>profit){
                profit=pt;
            }

        }
        return profit;
    }
}
