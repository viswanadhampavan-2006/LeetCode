class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        if(x<0){
            return false;
        }
        else{
            
            while(x>0){
                int k=x%10;
                rev=rev*10+k;
                x=x/10;
            }
            if(y!=rev){
                return false;
            }
            else{
                return true;
            }
        }
    }
}