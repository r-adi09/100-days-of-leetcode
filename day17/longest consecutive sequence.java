class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>hs = new HashSet<>();
        int curstreak = 0;
        int curnum = 0;
        int longeststreak = 0;
        for(int n : nums){
            hs.add(n);
        }
        for(int i:hs){
            if(!hs.contains(i-1)){
                curnum = i;
                curstreak = 1;
                while(hs.contains(curnum+1)){
                    curstreak++;
                    curnum++;
                }
            }
            longeststreak = Math.max(longeststreak, curstreak);
        }
        return longeststreak;

    }
}