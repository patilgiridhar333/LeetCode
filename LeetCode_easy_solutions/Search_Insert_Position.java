class Solution {
    public int searchInsert(int[] nums, int target) {
     int a=  Arrays.binarySearch(nums,target);
     if(a<0){
         if(nums[0]>target){
             return 0;
         }
         
         while(true ){
             target--;
             a=  Arrays.binarySearch(nums,target);
             if(a>=0){
                 return a+1;
             }
         }
     }
     else
     return a;
    }
}
