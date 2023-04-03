class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {
     sort(people.begin(), people.end());
     int n = people.size();
     int start_idx = 0;
     int end_idx = n - 1;
     int counter = 0;
     while(start_idx <= end_idx){
         counter++;
        int sum = people[start_idx] + people[end_idx];
         if(sum <=limit) start_idx++;
            end_idx--;
     }
     return counter;
   
    }
};
