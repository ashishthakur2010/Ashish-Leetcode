import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
                                 
        for(int i = 0; i<nums.length;i++){
            int indx = Math.abs(nums[i])-1;                               //  [-4,-3,-2,-7,8,2,-3,-1]
            if(nums[indx]>0)
            nums[indx] *= -1; 
            }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0){
               arr.add(i+1); 
            }
        }        

        return arr;
        }
        
    }
