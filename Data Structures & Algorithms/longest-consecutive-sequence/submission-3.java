class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        
        int max=0;

        for(int num:set){
            if(!set.contains(num-1)){
                int n=num;
                int count=1;
                while(set.contains(n+1)){
                    n=n+1;
                    count++;
                }  
                max=Math.max(max, count);              
            }
            
        }
        return max;
    }
}
