class Solution {
    public int hIndex(int[] citations) {

        int n=citations.length;
        Arrays.sort(citations);
        int answer=1;

        for(int i=0;i<n;i++){
            int cnt=n-i;

            if(cnt<citations[i]){
                answer=Math.max(answer,cnt);
                break;
            }
            answer=citations[i];
        }
        return answer;
    }
}