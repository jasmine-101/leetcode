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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null){
            return answer;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean reverse = false;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                level.add(cur.val);
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }

            }
            if(reverse){
                Collections.reverse(level);
            }
            answer.add(level);
            reverse=!reverse;
        }
        return answer;
    }
}