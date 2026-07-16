class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] arr=new int[n];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int k=0;
        for(int i=nums1.length;i<n;i++){
            arr[i]=nums2[k];
            k++;
        }
        Arrays.sort(arr);
        if(n%2==0){
            return (double)(arr[n/2 -1]+arr[n/2])/2;

        }else{
            return (double)arr[(n)/2];
        }
    }
}