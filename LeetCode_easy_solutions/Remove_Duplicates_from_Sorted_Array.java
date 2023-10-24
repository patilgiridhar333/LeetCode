class Solution {
    public void shift(int[] nums,int j){
        for(int i=j;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
    }
    public int removeDuplicates(int[] nums) {
       int count=1;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1])
            {
              nums[i]=-200;
              
            }else
          {  count++;}
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-200){
              shift(nums,i);
              i--;
            }
        }
        return count;
    }
}
