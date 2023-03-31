class NumArray {
    private int[]dp;


    public NumArray(int[] nums) {
        if(nums.length ==0)
        return;
        int n = nums.length;
        dp = new int[n + 1];
        for(int i =0; i <n; i++){
            dp[i + 1] = dp[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return dp[right + 1] - dp[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
