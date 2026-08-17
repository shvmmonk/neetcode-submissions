class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int end = heights.length - 1;
        int max = 0;

        while(i < end){
            int width = end - i;
            int h = Math.min(heights[i],heights[end]);
            int area = h * width;

            if(area > max){
                max = area;
            }

            if(heights[i] < heights[end]){
                i++;
            }else{
                end--;
            }
        }

        return max;
    }
}
