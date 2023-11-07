class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0,d=0,i=0;
        int a[]=new int[nums1.length];
        while(k!=m && d!=n){
            if(nums1[k]<=nums2[d]){
                   a[i]=nums1[k];
                   k++;
                   i++;
            }
            else{
                a[i]=nums2[d];
                d++;
                i++;
            }
        }
        while(k!=m){
            a[i]=nums1[k];
            k++;
            i++;
        }
         while(d!=n){
            a[i]=nums2[d];
            d++;
            i++;
        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=a[j];
        }
    }
}
