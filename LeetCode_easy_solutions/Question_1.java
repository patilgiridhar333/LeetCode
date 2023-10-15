class Solution {
    public int[] twoSum(int[] nums, int target) {
         int c[]=new int[2];
        for(int i=0;i<nums.length;i++){
            // if(nums[i]>target){
            //     continue;
            // }
            
            for(int j=0;j<nums.length;j++){
                // if(nums[j]>target)
                
                if(j!=i && nums[i]+nums[j]==target){
                   
                    c[0]=i;
                    c[1]=j;
                    break;
                   
                }
            }
        } return c;
    }
    
}
