class Solution {
    public int[] runningSum(int[] nums) {
        
        //ArrayList<Integer> arr = new ArrayList<>();
        int arr[] = new int[nums.length];
       // int sum =0;
       // int curr_sum=0;
        
        for(int i = 0; i < nums.length; i++){
            if(i==0){
                arr[i]=nums[i];
            }
            else
                arr[i]=arr[i-1]+nums[i];
        }
        
        // for(int i =nums.length-2; i>=0;i--){
        //     curr_sum =
        // }
        return arr;
    }
}