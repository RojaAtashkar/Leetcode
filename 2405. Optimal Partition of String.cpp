class Solution {
public:
    int partitionString(string s) {
     int count = 1;
     vector<int> alpha(26, 0);
     int l = s.size();
     for(int i = 0; i < s.size() ; i++){
    
         if(alpha[s[i] - 'a'] > 0){
          count++;
           alpha.assign(alpha.size(), 0);
         }
         alpha[s[i] - 'a']++;
     }
     return count;
    }
};
