class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            for(int j = i+1 ; j < prices.length ; j++){
                if(prices[j] > max){
                    max = prices[j];
                }

                ans = Math.max(ans,prices[j]-prices[i]);
            }
        }

        return ans;
    }
}
