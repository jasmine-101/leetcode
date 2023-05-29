class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int high=prices[0];
        int n = prices.length;
        int answer=0;

        for(int i=1;i<n;i++){
            if(low>prices[i]){
                low=prices[i];
                high=prices[i];
            }else if(low < prices[i]){
                high=Math.max(high,prices[i]);
                answer=Math.max(answer,high-low);
            }
        }

        return answer;
    }
}