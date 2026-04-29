class Solution {
    public List<List<String>> groupAnagrams(String[] st) {
        if(st.length==00){
             return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String word : st) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
        }        
}
