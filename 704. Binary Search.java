class Solution {
    public int search(int[] nums, int target) {
        int index = binarySearch(nums, 0, nums.length - 1, target);
   return index;

    }
    public int binarySearch(int nums[], int leftIndex, int rightIndex, int target)
    {
        if (rightIndex >= leftIndex)
        {
            int middle = leftIndex + (rightIndex - leftIndex)/2;
            if (nums[middle] == target)
               return middle;
  
            if (nums[middle] > target)
               return binarySearch(nums, leftIndex, middle-1, target);
            return binarySearch(nums, middle + 1, rightIndex, target);
        }
 
        return -1;
    }
  
}
