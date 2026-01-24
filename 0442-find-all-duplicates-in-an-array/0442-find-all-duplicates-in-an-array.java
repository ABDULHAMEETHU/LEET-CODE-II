class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> demo =new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int index = nums[i] -1;
            if(nums[i] != nums[index]){
                swap(nums,index,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1 ){
                demo.add(nums[j]);
            }
        }
        return demo;
    }
    static void swap(int[] arr,int first,int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }   
}