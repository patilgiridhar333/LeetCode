class Solution {

    public int findIndex(char ch[],char c){
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==c){
                j=i;
               break;
            }
        }
        return j;
    }
    public int romanToInt(String s) {
        char ch[]= {'I','V','X','L','C','D','M'};
        
         int val[]={1,5,10,50,100,500,1000};
         int sum=0;
         for(int i=0;i<s.length();i++){
             
             if(i<s.length()-1 && val[findIndex(ch,s.charAt(i))]<val[findIndex(ch,s.charAt(i+1))]){
                 sum=sum+(val[findIndex(ch,s.charAt(i+1))]-val[findIndex(ch,s.charAt(i))]);
                 i++;
             }else
            { 
                sum=sum+val[findIndex(ch,s.charAt(i))];
            }
         }
         return sum;
         
         
    }
}
