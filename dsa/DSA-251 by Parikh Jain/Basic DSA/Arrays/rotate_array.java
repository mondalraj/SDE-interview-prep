class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i<k; i++){
            int rotatedNum = nums[nums.length - 1];
            for(int j = nums.length - 2; j >= 0; j--){
                nums[j+1] = nums[j];
            }
            nums[0] = rotatedNum;
        }
    }
}