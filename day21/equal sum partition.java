class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        return subsetsum(nums, sum/2);


    }

    public boolean subsetsum(int[] arr, int k){
        boolean[][] dp = new boolean[arr.length+1][k+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        for(int i=1;i < dp.length;i++){
            int cur = arr[i-1];
            for(int j=1;j <=k;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = (dp[i-1][j-cur] || dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][k];
    }
}