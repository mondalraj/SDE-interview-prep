class Solution {
    public int removeDuplicates(int[] nums) {
        int nums_length = nums.length;
        int k = 0;
        int current_non_duplicate_num = -101;
        int k_current_index = 0;

        int[] result_array = new int[nums_length];
        Arrays.fill(result_array, 0);

        for(int i = 0; i < nums_length; i++){
            if(nums[i] != current_non_duplicate_num){
                current_non_duplicate_num = nums[i];
                result_array[k] = current_non_duplicate_num;
                k++;
                k_current_index++;
            }
        }

        for(int i = 0; i < nums_length; i++){
            nums[i] = result_array[i];
        }

        return k;
    }
}