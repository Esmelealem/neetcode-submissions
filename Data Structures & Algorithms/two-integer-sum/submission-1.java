class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        if(n==0) return new int[]{-1,-1};
       //Brute force
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        Map<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
