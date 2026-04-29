class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[]c1=s.toCharArray();
        char[]c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
        
        
        
        // if(s.length()!=t.length())  return false;
        // Map<Character, Integer>map=new HashMap<>();
        // for(char c:s.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(char c:t.toCharArray()){
        //     if(!map.containsKey(c)){
        //         return false;
        //     }
        //     map.put(c,map.get(c)-1);
        //     if(map.get(c)<0){
        //         return false;
        //     }
        // }
        // return true;
    }
}
