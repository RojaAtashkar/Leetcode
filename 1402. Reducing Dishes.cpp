class Solution {
public:
    int maxSatisfaction(vector<int>& satisfaction) {
        sort(satisfaction.begin(), satisfaction.end());
        int n = satisfaction.size();

        int like_time = satisfaction[n-1];
        int element_sum = satisfaction[n-1];
        if(like_time < 0)
            return 0; 
        for(int i = n - 2 ; i >= 0; i--){
            int prev_like_time = like_time;
            element_sum = element_sum + satisfaction[i];
            like_time = like_time + element_sum;
            if(prev_like_time >= like_time)
                return prev_like_time;
}

        return like_time;
    }
};

