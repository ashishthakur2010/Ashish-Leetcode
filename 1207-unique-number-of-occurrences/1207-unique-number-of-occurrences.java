class Solution {
    
    static int countFreq(int[] arr, int num){
        int count =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==num)
                count++;
        }
        return count;
    }
    
    public boolean uniqueOccurrences(int[] arr) {//arr[1,2,2,1,1,3]
                         
       Arrays.sort(arr);//arr[1,1,1,2,2,3]
              // System.out.print(arr.length);
        
       ArrayList<Integer> a = new ArrayList<Integer>();//a[]
        a.add(arr[0]); //a[1]
        

        int vl =arr[0];
        for(int i = 1; i < arr.length; i++){//[1,2,3]
            if(vl<arr[i]){
            a.add(arr[i]);
                vl=arr[i];
            }  
        }
        
        int b[]  = new int[a.size()]; //a[0,0,0]
        
        for(int i = 0; i < a.size();i++){  //[3,2,1] //[1,2,3]
            b[i]=(countFreq(arr,a.get(i)));     
        }
        //System.out.println(a);
        
       Arrays.sort(b);
        for(int j = 0; j < b.length-1;j++){  //[1,1,1,2,2,3] //[1,2,3]
          if(b[j]==b[j+1])
              return false;
        }   

        return true;
    }
    
}    
           