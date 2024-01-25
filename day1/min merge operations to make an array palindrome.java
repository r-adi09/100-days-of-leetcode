class Solution {
    public int minimumOperations(int[] nums) {

        //using two pointers to merge the 2 nums from the array
        //ptr1 at 0 index
        //prt2 at n-1 index
        //check if nums[i]>nums[j] then do merging at j
        //else do merging at i
        int n = nums.length;
        int p1 = 0;
        int p2 = n-1;
        int ans = 0;
        while(p1<p2){
            if(nums[p1] == nums[p2]){
                p1++;
                p2--;
            }
            else if(nums[p1]>nums[p2]){
                nums[p2-1] = nums[p2-1]+ nums[p2];
                p2--;
                ans++;
            }
            else if(nums[p1]<nums[p2]){
                nums[p1+1] = nums[p1+1]+ nums[p1];
                p1++;
                ans++;
            }
        }
        return ans;
    }
}