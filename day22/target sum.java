class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(target> sum || (sum-target)%2!=0){
            return 0;
        }
        int s1 = (sum - target)/2;
        return subsetsum(nums, s1);

    }

    public int subsetsum(int[] nums, int k){
        int[][] dp = new int[nums.length+1][k+1];
        for(int i=0;i<k+1;i++){
            dp[0][i] = 0;
        }
        dp[0][0]=1;
        for(int i=1;i<nums.length+1;i++){
            for(int j=0;j<=k;j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][k];
    }
}