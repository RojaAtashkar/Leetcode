class Solution {
    int n;
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      Arrays.sort(potions);
      int[] ans =new int[spells.length];
      int n = potions.length;
      this.n = n;
      int maxPotion = potions[n - 1];
      for (int i = 0; i < spells.length; i++){
        long minPotion = (long)Math.ceil((1.0 * success/spells[i]));
        if (minPotion > maxPotion){
            ans[i] = 0;
            continue;
        }
        ans[i] = binarySearch(potions, (int) minPotion);
      }
      return ans;
    }
      public int binarySearch(int[] potions,int minPotion){
          int left = 0;
          int right = n;
          while(left < right){
              int mid = left + (right - left)/2;
        
              if(potions[mid]< minPotion){
                  left = mid+1;
              }
              else{
                  right = mid;
    
              }
          
          }
          return n -  left;
      }
    }

