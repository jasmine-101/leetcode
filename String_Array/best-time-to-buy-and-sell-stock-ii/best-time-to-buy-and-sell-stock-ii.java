class Solution {
    public int maxProfit(int[] prices) {

        int low=Integer.MAX_VALUE;
        int sum=0;

        for(int i=0;i<prices.length;i++){
            low=Math.min(low,prices[i]);
            sum+=Math.max(0,prices[i]-low);
            low=prices[i];
        }

        return sum;
    }
}