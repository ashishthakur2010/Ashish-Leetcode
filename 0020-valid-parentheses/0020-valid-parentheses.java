class Solution {
    public boolean isValid(String s) {
        
        char[] arr = s.toCharArray();
        Stack<Character> st  = new Stack<>();
        
        if(arr.length % 2 != 0)
            return false;
        
        for(int i =0; i<arr.length;i++){
                if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
                st.push(arr[i]);
                else if(arr[i]==')' || arr[i]=='}' || arr[i]==']')
                if(!st.isEmpty()){
                    char c = st.peek();
                    if(c=='(' && arr[i]==')'  || c=='{' && arr[i]=='}' || c=='[' && arr[i]==']')
                      st.pop();
                    else
                        return false;
                  }else return false;
          }
        
        if(st.isEmpty())
            return true;
        else
            return false;
        
        
    }
}