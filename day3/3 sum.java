class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>hs = new HashSet<>();
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int p1 = i;
            int p2 = i+1;
            int p3 = nums.length-1;
            while(p2<p3){
                if(nums[p1]+nums[p2]+nums[p3] == 0){
                    hs.add(new ArrayList<>(Arrays.asList(nums[p1], nums[p2], nums[p3])));
                    while(p2<p3 && nums[p2]==nums[p2+1]){
                        p2++;
                    }
                    while(p2<p3 && nums[p3]==nums[p3-1]){
                        p3--;
                    }
                    p2++;
                    p3--;
                }
                else if(nums[p1]+nums[p2]+nums[p3] > 0){
                    p3--;
                }
                else if(nums[p1]+nums[p2]+nums[p3] < 0){
                    p2++;
                }
            }
        }
        result.addAll(hs);
        return result;


    }
}