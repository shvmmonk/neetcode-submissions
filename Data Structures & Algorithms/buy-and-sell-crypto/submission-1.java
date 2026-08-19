class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int nums:prices){
            min = Math.min(min , nums);
            max = Math.max(max,nums-min);
        }

        return max;
    }
}
