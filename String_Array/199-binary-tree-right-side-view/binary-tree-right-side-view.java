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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root == null){
            return answer;
        }

        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur=null;
            int size = q.size();
            for(int i=0;i<size;i++){
                cur = q.poll();
                if(cur.left != null){
                    q.offer(cur.left);
                }
                if(cur.right != null){
                    q.offer(cur.right);
                }
            }
            answer.add(cur.val);
        }
        return answer;
    }
}