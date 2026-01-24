class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> demo = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int current_index = nums[i]-1;
            if(nums[i] != nums[current_index]){
                swap(nums,i,current_index);
            }
            else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                nums[j] = j+1;
                demo.add(j+1);
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