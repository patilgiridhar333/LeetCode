class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
        }
     
        else { 
            int count=0;
            for(int i=0;i<digits.length;i++){
                 if(digits[i]==9)
                 count++;
                 if(count==digits.length){
                     int a[]=new int[digits.length+1];
                     a[0]=1;
                     return a;
                 }
            }
           for(int i=digits.length-1;i>0;i--){
               
                   digits[i]=0;
                   if(digits[i-1]!=9){
                   digits[i-1]+=1;
                   return digits;
                   }                 
           }
           return digits;
           }        
        }
    }
