class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            
        
     ArrayList <Integer> aux = new ArrayList<>();
     int i=0,j=0; 
        
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                aux.add(nums1[i]);
                i++;
            }
            else{
                aux.add(nums2[j]);
                j++;
            }
                
        }
        
        while(i<m){
            aux.add(nums1[i]);
            i++;
        }
        while(j<n){
            aux.add(nums2[j]);
            j++;
        }
        
        for(int id= 0; id< n + m; ++id){
            nums1[id]=aux.get(id);
        }
    }
}