class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int merged_array_length = nums1.length + nums2.length;
        int[] merged_array = new int[merged_array_length];
        // Merge 2 sorted arrays
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length || j < nums2.length){
            if(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    merged_array[k] = nums1[i];
                    i++;
                    k++;
                } else {
                    merged_array[k] = nums2[j];
                    j++;
                    k++;
                }
            }else if (i == nums1.length){
                // add all array elements from nums2
                while(j < nums2.length){
                    merged_array[k] = nums2[j];
                    j++;
                    k++;
                }
                break;
            }else {
                 // add all array elements from nums1
                 while(i < nums1.length){
                    merged_array[k] = nums1[i];
                    i++;
                    k++;
                }
                break;
            }
        }

        // Finding median
        if (merged_array.length % 2 != 0){
            result = merged_array[merged_array.length / 2];
        } else {
            result = ((double)(merged_array[(merged_array.length / 2) - 1] + 
            merged_array[(merged_array.length / 2)])) / 2;
        }

        return result;
    }
}