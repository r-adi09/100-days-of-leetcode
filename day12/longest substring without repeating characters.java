class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int l=0;
        int res = 0;
        Set<Character> tmp = new HashSet<>();
        tmp.add(s.charAt(0));
        int n = s.length();
        for(int i=1;i<n;i++){
            while(tmp.contains(s.charAt(i))){
                tmp.remove(s.charAt(l));
                l++;
            }
            tmp.add(s.charAt(i));
            res = Math.max(res, i-l+1);
        }
        return res;
    }
}