class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxval=0;
        int res =0;
        Map<Character, Integer>hm = new HashMap<>();
        for(int r=0;r<s.length();r++){
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0)+1);
            maxval = Collections.max(hm.values());
            while((r-l+1)-maxval > k){
                hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
                l++;
            }
            res = Math.max(res, r-l+1);

        }
        return res;

    }
}