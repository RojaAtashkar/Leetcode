class Solution {
    List<Integer> bounds = new ArrayList<>();
    public int maximumCount(int[] nums) {
        int left = 0, right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
    int neg = left;
    while (left < nums.length && nums[left] == 0) left++;
    int pos = nums.length - left;
    
    return Math.max(neg, pos);
    }
    
}
