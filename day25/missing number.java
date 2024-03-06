class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;){
            if(nums[i]!=0 && nums[i]!=i+1){
                swap(i, nums[i]-1, nums);
                i=0;
            }
            else{
                i++;
            }
        }
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return i+1;
            }
        }
        return 0;
    }

    public void swap(int i, int j, int[]nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}