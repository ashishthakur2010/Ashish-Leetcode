class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> ans(nums.size());
        
        
         for(int i = 0; i < nums.size(); i++){
            ans[i]= i == 0? nums[i] : ans[i-1] +nums[i];
        }
        
        
     return ans;   
    }
};