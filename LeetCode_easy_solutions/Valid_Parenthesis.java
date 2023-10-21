class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
         Stack<Character> ss=new Stack<Character>();
        for(int i=0;i<s.length();i++){
           
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            ss.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                  if(ss.isEmpty() ||ss.peek()!='('){
                      return false;
                  }
                  else{
                      ss.pop();
                  }
            }
             else if(s.charAt(i)=='}'){
                  if(ss.isEmpty() ||ss.peek()!='{'){
                      return false;
                  }
                  else{
                      ss.pop();
                  }
            }
             else if(s.charAt(i)==']'){
                  if(ss.isEmpty() || ss.peek()!='['){
                      return false;
                  }
                  else{
                      ss.pop();
                  }
            }
        }
        if(ss.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
