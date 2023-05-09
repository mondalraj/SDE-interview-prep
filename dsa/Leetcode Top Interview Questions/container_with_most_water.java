class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int start = 0;
        int end = height.length - 1;
        for(int i = start, j = end; i < j; ){
            int area = (j - i) * Math.min(height[i], height[j]);
            if(area > max_area){
                max_area = area;
            }
            if(height[i] > height[j]){
                j--;
            }else {
                i++;
            }
        }
        return max_area;
    }
}