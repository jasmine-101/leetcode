class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> stack=new Stack<>();
        int n=prices.length;
        stack.push(prices[0]);
        int sum=0;
        for(int i=1;i<n;i++){
            int cur=prices[i];
            if(stack.isEmpty()){
                stack.push(cur);
                continue;
            }

            if(stack.peek()<cur){
                if(stack.size()>1){
                    stack.pop();
                }
                stack.push(cur);
            }else if(stack.peek()>cur){
                int high=stack.pop();
                if(!stack.isEmpty()){
                    int low=stack.pop();
                    sum+=high-low;
                }
                stack.push(cur);
            }
        }

        if(stack.size()>1){
            sum+=stack.pop()-stack.pop();
        }

        return sum;

    }
}