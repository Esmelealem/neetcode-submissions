class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer>map=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.contains(nums[i])){
        //         return nums[i];
        //     }
        //     map.add(nums[i]);
        // }

        // return -1;
        int low = 1;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return high;
        
    }
}
