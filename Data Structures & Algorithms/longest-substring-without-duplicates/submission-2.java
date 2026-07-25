class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int maxLen=0;
    //     int start=0;
    //     Set<Character>set=new HashSet<>();
    //     for(int end=0;end<s.length();end++){
    //         while(set.contains(s.charAt(end))){
    //             set.remove(s.charAt(start++));
    //         }
    //         set.add(s.charAt(end));
    //         maxLen=Math.max(maxLen,end-start+1);
    //     }
    //   return maxLen;  
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, res = 0;
        for (int r = 0; r < s.length(); r++) {
            if (mp.containsKey(s.charAt(r))) {
                l = Math.max(mp.get(s.charAt(r)) + 1, l);
            }
            mp.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;  
    }
}
