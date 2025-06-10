class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int arr[] = new int[2];
        arr[0] = FirstSearch(nums,start,end,target); // first element 
        arr[1] = LastSearch(nums,start,end,target);
        return arr;
    }
    static int FirstSearch(int[] nums,int start,int end,int target){
        int answer =-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                answer = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return answer;
    }
    static int LastSearch(int[] nums,int start,int end,int target){
        int answer =-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                answer = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return answer;
    }
}
