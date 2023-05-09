class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();

        Arrays.sort(nums);

        // [-4, -1, -1, 0, 1, 2]

        for(int i = 0; i < nums.length - 2; i++){
            // skipping duplicate i values
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int target = 0 - nums[i];

            // 2 sum implementation

            int start = i + 1;
            int end = nums.length - 1;

            while(start < end){
                if(nums[start] + nums[end] == target){
                    // triplet found
                    List<Integer> res = new ArrayList<Integer>();
                    res.add(nums[i]);
                    res.add(nums[start]);
                    res.add(nums[end]);

                    ans.add(res);
                    while(start < end && nums[start] == nums[start + 1] ) start++;
                    while(start < end && nums[end] == nums[end - 1] ) end--;

                    start++;
                    end--;
                } else if (nums[start] + nums[end] > target){
                    end--;
                }else {
                    start++;
                }
            }
        }

        return ans;
    }
}