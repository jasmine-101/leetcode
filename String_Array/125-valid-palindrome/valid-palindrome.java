class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length()-1;
        char left, right;
        while(p1<=p2){

            left=getValidCharacter(s.charAt(p1));
            right=getValidCharacter(s.charAt(p2));

            if(left=='*'){
                p1++;
            }else if(right=='*'){
                p2--;
            }else{
                if(left!=right){
                    return false;
                }
                p1++;
                p2--;
            }
        }

        return true;

    }
    private char getValidCharacter(char c){
        if(c >= 'a' && c<='z' || c>='0' && c<='9'){
            return c;
        }else if (c>='A' && c<='Z'){
            return Character.toLowerCase(c);
        }else{
            return '*';
        }
    }
}