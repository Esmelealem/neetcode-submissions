class Solution {

    public String encode(List<String> st) {
        // if(st==null ||
        // if(st.isEmpty()) return null;
        StringBuilder sb=new StringBuilder();
        for(String s:st){
        sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
    //  if(str==null || str.isEmpty()) return null;
List<String> res = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
