class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int size=0;
        if(nums1.length < nums2.length){
            size=nums1.length;
        }
        else size = nums2.length;
        int[] arr = new int[size];
        int i=0;
        int j=0;
        int k=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i]==nums2[j]){
                arr[k] = nums1[i];
                i++;
                j++;
                k++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}