class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rem = 0;
        int sum = 0;
        while(temp>0){
            rem = temp%10;
            temp/= 10;
            sum= rem + sum*10;
        }
        if(sum==x)
            return true;
        else
            return false;
    }
}