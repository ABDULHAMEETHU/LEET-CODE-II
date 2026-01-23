class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                    low++;
                    mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high --;
            }
        }
    }
     static void swap(int[] arr,int first,int last){
        int temp;
        temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}