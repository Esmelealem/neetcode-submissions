class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] prefix = new int[n]; // To store prefix products
        int[] suffix = new int[n]; // To store suffix products
        int[] output = new int[n]; // Final result

        // Step 1: Compute prefix products
        prefix[0] = 1; // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix products
        suffix[n - 1] = 1; // There are no elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Step 3: Multiply prefix and suffix to get the result
        for (int i = 0; i < n; i++) {
            output[i] = prefix[i] * suffix[i];
        }

        return output;
    }
}  
