class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        int n=nums.length;
        int j=0,k=0;
       while(j<n){
        if(nums[j]==1){
            count++;
            j++;
            max=Math.max(max,count);
        }else{
            count=0;
            j++;
        }
       }
       return max;
    }
}