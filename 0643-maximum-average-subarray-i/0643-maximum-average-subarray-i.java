class Solution {
    public double findMaxAverage(int[] nums, int k) {
            double cunt_avg=0; 
            double sum=0;
        for(int i = 0; i< k; i++){
            sum += nums[i];
            cunt_avg=sum/k;
        }
         double finl_avg=cunt_avg;
        for(int st = 1, en = k; en < nums.length; st++, en++){
             sum -= nums[st-1];
             sum += nums[en];
             cunt_avg=sum/k;
             finl_avg=(Math.max(finl_avg,cunt_avg));

        }
        return finl_avg;
    }
}