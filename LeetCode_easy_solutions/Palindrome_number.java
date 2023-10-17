class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
          int a[]=new int[1000];
          int count=0;
          
        while(x!=0){
            a[count]=x%10;
            x=x/10;
            count++;
        }
        
        int b[]=new int[count];
        int j=count-1;
          for(int i=0;i<count;i++){
                
              b[i]=a[j];
              j--;
            
          }
         
        for(int i=0;i<count;i++){
              if(b[i]!=a[i]){
                  return false;
              }
        }
          return true;   
        }
}
