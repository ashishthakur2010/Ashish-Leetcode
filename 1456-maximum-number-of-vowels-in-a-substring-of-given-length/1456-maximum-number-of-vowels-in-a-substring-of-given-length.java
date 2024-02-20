class Solution {
    
   private int isVowel(char a){
        return (a=='a'||a=='e'||a=='i'||a=='o'||a=='u') ? 1 : 0;
   }
 
    int maxVowels(String s, int k) {
        int cunt_max=0;
        int finl_max=0;
        int n = s.length();

        for(int i = 0; i<k; i++ ){
           cunt_max+=isVowel(s.charAt(i));
            //finl_max=cunt_max,finl_max);
        }
             finl_max=Math.max(cunt_max,finl_max); 
        
        for(int st=1,en=k; en < n; st++,en++){
            cunt_max-=isVowel(s.charAt(st-1));
            cunt_max+=isVowel(s.charAt(en));
            finl_max=Math.max(cunt_max,finl_max); 
        }
        
        
    return finl_max;
     }
    

   }


// static boolean isVowel(char a){
//        //  for(int i = 0; i<k; i++ ){
//             if(charAt(i)=='a'||charAt(i)=='e'||charAt(i)=='i'||charAt(i)=='o'||charAt(i)=='u'){
//                return true;
//             }
//         return false;
//     }