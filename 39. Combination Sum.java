class Solution {
     List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length==0 || target<=0) return ans;
          Arrays.sort(candidates);
          solve(target, candidates,new ArrayList<>(), 0);

        return ans;
    }
   public  void solve(int target, int[] candidates, ArrayList<Integer> temp, int i){
    if(target == 0){
        ans.add(new ArrayList<>(temp));
            return;
    }
    for (int j = i; j < candidates.length; j++){
        if(candidates[j] > target) break;
        temp.add(candidates[j]);
        solve(target - candidates[j], candidates, temp, j);
        temp.remove(temp.size()-1);
    }
    
}

}
