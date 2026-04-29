class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int maxSofar=Integer.MIN_VALUE, endMax=0;
        for(int num: nums){
            endMax+=num;
            maxSofar=Math.max(maxSofar,endMax);
            endMax=Math.max(endMax,0);
        }
        return maxSofar;
    }

}
