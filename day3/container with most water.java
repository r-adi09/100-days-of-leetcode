class Solution {
    public int maxArea(int[] height) {

        //take two ptrs
        //compute area, try to store max
        //then move ptrs based on height of left and right
        int area = 0;
        int p1 = 0;
        int p2 = height.length-1;
        while(p1<p2){
            area = Math.max(area,(p2-p1)* Math.min(height[p1], height[p2]));
            if(height[p1]<=height[p2]){
                p1++;
            }
            else{
                p2--;
            }

        }
        return area;
    }
}