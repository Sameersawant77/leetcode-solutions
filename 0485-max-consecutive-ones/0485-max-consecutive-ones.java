class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneCount=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                oneCount++;
            }
            if(oneCount>max){
                max=oneCount;
            }
            if(nums[i]!=1){
                oneCount=0;
            }
        }
        return max;
    }
}