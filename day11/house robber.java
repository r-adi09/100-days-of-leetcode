class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        int tmp = 0;
        for(int i:nums){
            tmp = Math.max(rob1+i, rob2);
            rob1 = rob2;
            rob2 = tmp;
        }
        return rob2;

    }
}