class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int k = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
       
         this.k = k;
           int candidates[] =  new int[]{ 1,2,3,4,5,6,7,8,9 }; 
          solve(n, candidates,new ArrayList<>(), 0, 0);

        return ans; 


    }
     public  void solve(int target, int[] candidates, ArrayList<Integer> temp, int i, int counter){
        
    if(target == 0){
       if (counter == k)
        ans.add(new ArrayList<>(temp));
            return;
    }

    for (int j = i ; j < candidates.length; j++){
          if (j > i && candidates[j] == candidates[j - 1])
                continue;
        if(candidates[j] > target || counter >= k) break;
        temp.add(candidates[j]);
        counter++;
        solve(target - candidates[j], candidates, temp, j + 1, counter);
     counter--;
        temp.remove(temp.size()-1);
    }
    
}
}
