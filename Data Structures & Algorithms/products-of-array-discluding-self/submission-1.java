class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute prefix products and store in output array
        output[0] = 1; // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix products and multiply with prefix products
        int suffixProduct = 1; // Initialize suffix product
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffixProduct; // Multiply prefix with suffix
            suffixProduct = suffixProduct * nums[i]; // Update suffix product
        }

        return output;

    }
}  
