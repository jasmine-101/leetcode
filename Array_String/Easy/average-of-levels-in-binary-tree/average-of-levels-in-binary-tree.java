/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        q.offer(root);
        List<Double> answer=new ArrayList<>();

        while(!q.isEmpty()){
            int size=q.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                sum+=cur.val;
                TreeNode left=cur.left;
                TreeNode right=cur.right;

                if(cur.left!=null){
                    q.offer(cur.left);
                }

                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            answer.add(sum/size);
        }
        return answer;
    }

}